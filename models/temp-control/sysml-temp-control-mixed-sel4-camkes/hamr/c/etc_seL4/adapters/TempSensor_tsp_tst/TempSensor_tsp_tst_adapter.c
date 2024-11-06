#include <TempSensor_tsp_tst_adapter.h>

Unit tc_TempControlMixedSeL4CAmKES_TempSensor_tsp_tst_adapter_initialiseArchitecture(STACK_FRAME_ONLY) {
  DeclNewStackFrame(caller, "TempSensor_tsp_tst_adapter.c", "", "tc_TempControlMixedSeL4CAmKES_TempSensor_tsp_tst_adapter_initialiseArchitecture", 0);

  tc_TempSensor_tsp_tst_tst_seL4App_initialiseArchitecture(SF_LAST);
}

Unit tc_TempControlMixedSeL4CAmKES_TempSensor_tsp_tst_adapter_initialiseEntryPoint(STACK_FRAME_ONLY) {
  DeclNewStackFrame(caller, "TempSensor_tsp_tst_adapter.c", "", "tc_TempControlMixedSeL4CAmKES_TempSensor_tsp_tst_adapter_initialiseEntryPoint", 0);

  tc_TempSensor_tsp_tst_tst_seL4App_initialiseEntryPoint(SF_LAST);
}

Unit tc_TempControlMixedSeL4CAmKES_TempSensor_tsp_tst_adapter_computeEntryPoint(STACK_FRAME_ONLY) {
  DeclNewStackFrame(caller, "TempSensor_tsp_tst_adapter.c", "", "tc_TempControlMixedSeL4CAmKES_TempSensor_tsp_tst_adapter_computeEntryPoint", 0);

  tc_TempSensor_tsp_tst_tst_seL4App_computeEntryPoint(SF_LAST);
}

art_Bridge_EntryPoints tc_TempControlMixedSeL4CAmKES_TempSensor_tsp_tst_adapter_entryPoints(STACK_FRAME_ONLY) {
  DeclNewStackFrame(caller, "TempSensor_tsp_tst_adapter.c", "", "tc_TempControlMixedSeL4CAmKES_TempSensor_tsp_tst_adapter_entryPoints", 0);

  return tc_TempSensor_tsp_tst_tst_seL4App_entryPoints(SF_LAST);
}
