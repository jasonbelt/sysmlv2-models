add_definitions(-DCAMKES)

if(TARGET muslc)
  target_link_libraries(OrLogic_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic
                        muslc)
endif()