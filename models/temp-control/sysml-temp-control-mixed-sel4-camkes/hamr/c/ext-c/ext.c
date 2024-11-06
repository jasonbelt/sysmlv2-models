#include <ext.h>

#ifdef CAMKES

  // seL4's muslibc does not implement the methods in time.h
  // just always return the same seed.
  Z extension_Time_currentNanos(STACK_FRAME_ONLY) {
    return 1729538402824;
  }

#else

#include <time.h>

// This file will not be overwritten so is safe to edit

// add c extension code here

Z extension_Time_currentNanos(STACK_FRAME_ONLY) {
    struct timespec res;

    /* read consecutive nanosecond values */
    clock_gettime(CLOCK_REALTIME,&res);
    return  res.tv_nsec;
}

#endif