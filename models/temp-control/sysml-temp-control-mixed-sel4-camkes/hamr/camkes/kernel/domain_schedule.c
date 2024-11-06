#include <config.h>
#include <object/structures.h>
#include <model/statedata.h>

// this file will not be overwritten and is safe to edit

/************************************************************

   This is a kernel data structure containing an example schedule.
   The length is in seL4 ticks (1 ms).
   This schedule should be generated from the AADL model
   using execution time and data flow latency specifications.


   Properties from AADL Model
   --------------------------

     Timing_Properties::Clock_Period : 1 ms
     Timing_Properties::Frame_Period : 1000 ms

     tsp_tst : Thread
     ----------------

       CASE_Scheduling::Domain : 3
       Thread_Properties::Dispatch_Protocol : Periodic
       Timing_Properties::Compute_Execution_Time : 0 ms
       Timing_Properties::Period : 1000 ms

     tcp_tct : Thread
     ----------------

       CASE_Scheduling::Domain : 2
       Thread_Properties::Dispatch_Protocol : Sporadic
       Timing_Properties::Compute_Execution_Time : 0 ms
       Timing_Properties::Period : 1000 ms

     fp_ft : Thread
     --------------

       CASE_Scheduling::Domain : 4
       Thread_Properties::Dispatch_Protocol : Sporadic
       Timing_Properties::Compute_Execution_Time : 0 ms


 *********************************************************/

const dschedule_t ksDomSchedule[] = {
  { .domain = 0, .length = 200 },  // all other seL4 threads, init, 200ms
  { .domain = 3, .length = 100 },  // tsp_tst 0 ms
  { .domain = 0, .length = 10 },  // switch to domain 0 to allow seL4 to deliver messages
  { .domain = 2, .length = 100 },  // tcp_tct 0 ms
  { .domain = 0, .length = 10 },  // switch to domain 0 to allow seL4 to deliver messages
  { .domain = 4, .length = 100 },  // fp_ft 0 ms
  { .domain = 0, .length = 480 },  // pad rest of frame period
};

const word_t ksDomScheduleLength = sizeof(ksDomSchedule) / sizeof(dschedule_t);
