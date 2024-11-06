add_definitions(-DCAMKES)

if(TARGET muslc)
  target_link_libraries(Fan_fp_ft
                        muslc)
endif()