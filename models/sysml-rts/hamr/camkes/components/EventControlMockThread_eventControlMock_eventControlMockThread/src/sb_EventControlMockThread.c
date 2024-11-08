// Do not edit this file as it will be overwritten if HAMR codegen is rerun

#include <sb_EventControlMockThread.h>
#include <EventControlMockThread_eventControlMock_eventControlMockThread_adapter.h>
#include <string.h>
#include <camkes.h>

static bool sb_occurred_periodic_dispatcher;
static int64_t sb_time_periodic_dispatcher;

/************************************************************************
 * periodic_dispatcher_write_int64_t
 * Invoked from remote periodic dispatch thread.
 *
 * This function records the current time and triggers the active thread
 * dispatch from a periodic event.  Note that the periodic dispatch
 * thread is the *only* thread that triggers a dispatch, so we do not
 * mutex lock the function.
 *
 ************************************************************************/

bool periodic_dispatcher_write_int64_t(const int64_t * arg) {
    sb_occurred_periodic_dispatcher = true;
    sb_time_periodic_dispatcher = *arg;
    MUTEXOP(sb_dispatch_sem_post());
    return true;
}

void sb_periodic_dispatch_notification_callback(void *_ UNUSED) {
   // we want time in microseconds, not nanoseconds, so we divide by 1000.
   int64_t sb_time_periodic_dispatcher = 0; // sb_timer_time() / 1000LL -- timer connection disabled;
   (void)periodic_dispatcher_write_int64_t(&sb_time_periodic_dispatcher);
   CALLBACKOP(sb_periodic_dispatch_notification_reg_callback(sb_periodic_dispatch_notification_callback, NULL));
}


seqNum_t sb_manualActuatorInput2_seqNum;

seqNum_t sb_manualActuatorInput1_seqNum;

bool sb_manualActuatorInput1_write(const union_art_DataContent * value) {
  return write_sp_union_art_DataContent(sb_manualActuatorInput1, value, &sb_manualActuatorInput1_seqNum);
}

bool sb_manualActuatorInput2_write(const union_art_DataContent * value) {
  return write_sp_union_art_DataContent(sb_manualActuatorInput2, value, &sb_manualActuatorInput2_seqNum);
}

// send manualActuatorInput1: Out DataPort bool
Unit rts_EventControl_EventControlMockThread_eventControlMock_eventControlMockThread_seL4Nix_manualActuatorInput1_Send(
  STACK_FRAME
  art_DataContent d) {
  DeclNewStackFrame(caller, "sb_EventControlMockThread.c", "", "rts_EventControl_EventControlMockThread_eventControlMock_eventControlMockThread_seL4Nix_manualActuatorInput1_Send", 0);

  sb_manualActuatorInput1_write(d);
}

// send manualActuatorInput2: Out DataPort bool
Unit rts_EventControl_EventControlMockThread_eventControlMock_eventControlMockThread_seL4Nix_manualActuatorInput2_Send(
  STACK_FRAME
  art_DataContent d) {
  DeclNewStackFrame(caller, "sb_EventControlMockThread.c", "", "rts_EventControl_EventControlMockThread_eventControlMock_eventControlMockThread_seL4Nix_manualActuatorInput2_Send", 0);

  sb_manualActuatorInput2_write(d);
}

void pre_init(void) {
  DeclNewStackFrame(NULL, "sb_EventControlMockThread.c", "", "pre_init", 0);

  printf("Entering pre-init of EventControlMockThread_eventControlMock_eventControlMockThread\n");

  // initialise data structure for data port manualActuatorInput1
  init_sp_union_art_DataContent(sb_manualActuatorInput1, &sb_manualActuatorInput1_seqNum);

  // initialise data structure for data port manualActuatorInput2
  init_sp_union_art_DataContent(sb_manualActuatorInput2, &sb_manualActuatorInput2_seqNum);

  // initialise slang-embedded components/ports
  rts_EventControl_EventControlMockThread_eventControlMock_eventControlMockThread_adapter_initialiseArchitecture(SF_LAST);

  // call the component's initialise entrypoint
  rts_EventControl_EventControlMockThread_eventControlMock_eventControlMockThread_adapter_initialiseEntryPoint(SF_LAST);

  printf("Leaving pre-init of EventControlMockThread_eventControlMock_eventControlMockThread\n");
}

/************************************************************************
 * int run(void)
 * Main active thread function.
 ************************************************************************/
int run(void) {
  DeclNewStackFrame(NULL, "sb_EventControlMockThread.c", "", "run", 0);

  CALLBACKOP(sb_periodic_dispatch_notification_reg_callback(sb_periodic_dispatch_notification_callback, NULL));
  MUTEXOP(sb_dispatch_sem_wait())
  for(;;) {
    MUTEXOP(sb_dispatch_sem_wait())
    // call the component's compute entrypoint
    rts_EventControl_EventControlMockThread_eventControlMock_eventControlMockThread_adapter_computeEntryPoint(SF_LAST);
  }
  return 0;
}
