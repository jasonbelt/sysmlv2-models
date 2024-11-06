// #Sireum

package tc

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Temperature.scala

TempUnit.scala

SetPoint.scala

FanCmd.scala

FanAck.scala

Base_Types.scala

TempSensor_tsp_tst_Containers.scala

TempControl_tcp_tct_Containers.scala

Fan_fp_ft_Containers.scala

Container.scala

DataContent.scala

Aux_Types.scala

*/

@msig trait RandomLibI {
  def gen: org.sireum.Random.Gen

  def get_numElement: Z
  def set_numElement(s: Z): Unit

  // ========  Z ==========
    def get_Config_Z: Config_Z
    def set_Config_Z(config: Config_Z): RandomLib

    def nextZ(): Z = {
      val conf = get_Config_Z

      var r: Z = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextZ()
          else
            gen.nextZBetween(S64.Min.toZ, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextZBetween(conf.low.get, S64.Max.toZ)
          else
            gen.nextZBetween(conf.low.get, conf.high.get)
        }

      if(get_Config_Z.attempts >= 0) {
       for (i <- 0 to get_Config_Z.attempts) {
         if (get_Config_Z.filter(r)) {
           return r
         }
         if (get_Config_Z.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextZ()
           else
              gen.nextZBetween(S64.Min.toZ, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextZBetween(conf.low.get, S64.Max.toZ)
            else
             gen.nextZBetween(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_Z.filter(r)) {
           return r
         }
         if (get_Config_Z.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextZ()
           else
              gen.nextZBetween(S64.Min.toZ, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextZBetween(conf.low.get, S64.Max.toZ)
            else
             gen.nextZBetween(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  B ==========}
    def get_Config_B: Config_B
    def set_Config_B(config: Config_B): RandomLib

    def nextB(): B = {
      var r = gen.nextB()
      if(get_Config_B.attempts >= 0) {
       for (i <- 0 to get_Config_B.attempts) {
         if (get_Config_B.filter(r)) {
           return r
         }
         if (get_Config_B.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = gen.nextB()
       }
      } else {
       while(T) {
         if (get_Config_B.filter(r)) {
           return r
         }
         if (get_Config_B.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = gen.nextB()
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  C ==========
    def get_Config_C: Config_C
    def set_Config_C(config: Config_C): RandomLib

    def nextC(): C = {
      val conf = get_Config_C

      var r: C = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextC()
          else
            gen.nextCBetween(C.fromZ(0), conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextCBetween(conf.low.get, C.fromZ(1114111))
          else
            gen.nextCBetween(conf.low.get, conf.high.get)
        }

      if(get_Config_C.attempts >= 0) {
       for (i <- 0 to get_Config_C.attempts) {
         if (get_Config_C.filter(r)) {
           return r
         }
         if (get_Config_C.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextC()
           else
              gen.nextCBetween(C.fromZ(0), conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextCBetween(conf.low.get, C.fromZ(1114111))
            else
             gen.nextCBetween(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_C.filter(r)) {
           return r
         }
         if (get_Config_C.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextC()
           else
              gen.nextCBetween(C.fromZ(0), conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextCBetween(conf.low.get, C.fromZ(1114111))
            else
             gen.nextCBetween(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  R ==========
    def get_Config_R: Config_R
    def set_Config_R(config: Config_R): RandomLib

    def nextR(): R = {
      val conf = get_Config_R

      var r: R = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextR()
          else
            gen.nextRBetween(r"-1.7976931348623157E308", conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextRBetween(conf.low.get, r"1.7976931348623157E308")
          else
            gen.nextRBetween(conf.low.get, conf.high.get)
        }

      if(get_Config_R.attempts >= 0) {
       for (i <- 0 to get_Config_R.attempts) {
         if (get_Config_R.filter(r)) {
           return r
         }
         if (get_Config_R.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextR()
           else
              gen.nextRBetween(r"-1.7976931348623157E308", conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextRBetween(conf.low.get, r"1.7976931348623157E308")
            else
             gen.nextRBetween(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_R.filter(r)) {
           return r
         }
         if (get_Config_R.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextR()
           else
              gen.nextRBetween(r"-1.7976931348623157E308", conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextRBetween(conf.low.get, r"1.7976931348623157E308")
            else
             gen.nextRBetween(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  F32 ==========
    def get_Config_F32: Config_F32
    def set_Config_F32(config: Config_F32): RandomLib

    def nextF32(): F32 = {
      val conf = get_Config_F32

      var r: F32 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextF32()
          else
            gen.nextF32Between(f32"-3.40282347E38f", conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextF32Between(conf.low.get, f32"3.4028235E38f")
          else
            gen.nextF32Between(conf.low.get, conf.high.get)
        }

      if(get_Config_F32.attempts >= 0) {
       for (i <- 0 to get_Config_F32.attempts) {
         if (get_Config_F32.filter(r)) {
           return r
         }
         if (get_Config_F32.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextF32()
           else
              gen.nextF32Between(f32"-3.40282347E38f", conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextF32Between(conf.low.get, f32"3.4028235E38f")
            else
             gen.nextF32Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_F32.filter(r)) {
           return r
         }
         if (get_Config_F32.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextF32()
           else
              gen.nextF32Between(f32"-3.40282347E38f", conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextF32Between(conf.low.get, f32"3.4028235E38f")
            else
             gen.nextF32Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  F64 ==========
    def get_Config_F64: Config_F64
    def set_Config_F64(config: Config_F64): RandomLib

    def nextF64(): F64 = {
      val conf = get_Config_F64

      var r: F64 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextF64()
          else
            gen.nextF64Between(f64"-1.7976931348623157E308f", conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextF64Between(conf.low.get, f64"1.7976931348623157E308f")
          else
            gen.nextF64Between(conf.low.get, conf.high.get)
        }

      if(get_Config_F64.attempts >= 0) {
       for (i <- 0 to get_Config_F64.attempts) {
         if (get_Config_F64.filter(r)) {
           return r
         }
         if (get_Config_F64.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextF64()
           else
              gen.nextF64Between(f64"-1.7976931348623157E308f", conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextF64Between(conf.low.get, f64"1.7976931348623157E308f")
            else
             gen.nextF64Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_F64.filter(r)) {
           return r
         }
         if (get_Config_F64.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextF64()
           else
              gen.nextF64Between(f64"-1.7976931348623157E308f", conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextF64Between(conf.low.get, f64"1.7976931348623157E308f")
            else
             gen.nextF64Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  S8 ==========
    def get_Config_S8: Config_S8
    def set_Config_S8(config: Config_S8): RandomLib

    def nextS8(): S8 = {
      val conf = get_Config_S8

      var r: S8 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextS8()
          else
            gen.nextS8Between(S8.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextS8Between(conf.low.get, S8.Max)
          else
            gen.nextS8Between(conf.low.get, conf.high.get)
        }

      if(get_Config_S8.attempts >= 0) {
       for (i <- 0 to get_Config_S8.attempts) {
         if (get_Config_S8.filter(r)) {
           return r
         }
         if (get_Config_S8.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS8()
           else
              gen.nextS8Between(S8.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS8Between(conf.low.get, S8.Max)
            else
             gen.nextS8Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_S8.filter(r)) {
           return r
         }
         if (get_Config_S8.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS8()
           else
              gen.nextS8Between(S8.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS8Between(conf.low.get, S8.Max)
            else
             gen.nextS8Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  S16 ==========
    def get_Config_S16: Config_S16
    def set_Config_S16(config: Config_S16): RandomLib

    def nextS16(): S16 = {
      val conf = get_Config_S16

      var r: S16 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextS16()
          else
            gen.nextS16Between(S16.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextS16Between(conf.low.get, S16.Max)
          else
            gen.nextS16Between(conf.low.get, conf.high.get)
        }

      if(get_Config_S16.attempts >= 0) {
       for (i <- 0 to get_Config_S16.attempts) {
         if (get_Config_S16.filter(r)) {
           return r
         }
         if (get_Config_S16.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS16()
           else
              gen.nextS16Between(S16.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS16Between(conf.low.get, S16.Max)
            else
             gen.nextS16Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_S16.filter(r)) {
           return r
         }
         if (get_Config_S16.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS16()
           else
              gen.nextS16Between(S16.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS16Between(conf.low.get, S16.Max)
            else
             gen.nextS16Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  S32 ==========
    def get_Config_S32: Config_S32
    def set_Config_S32(config: Config_S32): RandomLib

    def nextS32(): S32 = {
      val conf = get_Config_S32

      var r: S32 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextS32()
          else
            gen.nextS32Between(S32.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextS32Between(conf.low.get, S32.Max)
          else
            gen.nextS32Between(conf.low.get, conf.high.get)
        }

      if(get_Config_S32.attempts >= 0) {
       for (i <- 0 to get_Config_S32.attempts) {
         if (get_Config_S32.filter(r)) {
           return r
         }
         if (get_Config_S32.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS32()
           else
              gen.nextS32Between(S32.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS32Between(conf.low.get, S32.Max)
            else
             gen.nextS32Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_S32.filter(r)) {
           return r
         }
         if (get_Config_S32.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS32()
           else
              gen.nextS32Between(S32.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS32Between(conf.low.get, S32.Max)
            else
             gen.nextS32Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  S64 ==========
    def get_Config_S64: Config_S64
    def set_Config_S64(config: Config_S64): RandomLib

    def nextS64(): S64 = {
      val conf = get_Config_S64

      var r: S64 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextS64()
          else
            gen.nextS64Between(S64.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextS64Between(conf.low.get, S64.Max)
          else
            gen.nextS64Between(conf.low.get, conf.high.get)
        }

      if(get_Config_S64.attempts >= 0) {
       for (i <- 0 to get_Config_S64.attempts) {
         if (get_Config_S64.filter(r)) {
           return r
         }
         if (get_Config_S64.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS64()
           else
              gen.nextS64Between(S64.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS64Between(conf.low.get, S64.Max)
            else
             gen.nextS64Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_S64.filter(r)) {
           return r
         }
         if (get_Config_S64.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS64()
           else
              gen.nextS64Between(S64.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS64Between(conf.low.get, S64.Max)
            else
             gen.nextS64Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  U8 ==========
    def get_Config_U8: Config_U8
    def set_Config_U8(config: Config_U8): RandomLib

    def nextU8(): U8 = {
      val conf = get_Config_U8

      var r: U8 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextU8()
          else
            gen.nextU8Between(U8.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextU8Between(conf.low.get, U8.Max)
          else
            gen.nextU8Between(conf.low.get, conf.high.get)
        }

      if(get_Config_U8.attempts >= 0) {
       for (i <- 0 to get_Config_U8.attempts) {
         if (get_Config_U8.filter(r)) {
           return r
         }
         if (get_Config_U8.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU8()
           else
              gen.nextU8Between(U8.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU8Between(conf.low.get, U8.Max)
            else
             gen.nextU8Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_U8.filter(r)) {
           return r
         }
         if (get_Config_U8.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU8()
           else
              gen.nextU8Between(U8.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU8Between(conf.low.get, U8.Max)
            else
             gen.nextU8Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  U16 ==========
    def get_Config_U16: Config_U16
    def set_Config_U16(config: Config_U16): RandomLib

    def nextU16(): U16 = {
      val conf = get_Config_U16

      var r: U16 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextU16()
          else
            gen.nextU16Between(U16.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextU16Between(conf.low.get, U16.Max)
          else
            gen.nextU16Between(conf.low.get, conf.high.get)
        }

      if(get_Config_U16.attempts >= 0) {
       for (i <- 0 to get_Config_U16.attempts) {
         if (get_Config_U16.filter(r)) {
           return r
         }
         if (get_Config_U16.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU16()
           else
              gen.nextU16Between(U16.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU16Between(conf.low.get, U16.Max)
            else
             gen.nextU16Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_U16.filter(r)) {
           return r
         }
         if (get_Config_U16.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU16()
           else
              gen.nextU16Between(U16.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU16Between(conf.low.get, U16.Max)
            else
             gen.nextU16Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  U32 ==========
    def get_Config_U32: Config_U32
    def set_Config_U32(config: Config_U32): RandomLib

    def nextU32(): U32 = {
      val conf = get_Config_U32

      var r: U32 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextU32()
          else
            gen.nextU32Between(U32.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextU32Between(conf.low.get, U32.Max)
          else
            gen.nextU32Between(conf.low.get, conf.high.get)
        }

      if(get_Config_U32.attempts >= 0) {
       for (i <- 0 to get_Config_U32.attempts) {
         if (get_Config_U32.filter(r)) {
           return r
         }
         if (get_Config_U32.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU32()
           else
              gen.nextU32Between(U32.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU32Between(conf.low.get, U32.Max)
            else
             gen.nextU32Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_U32.filter(r)) {
           return r
         }
         if (get_Config_U32.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU32()
           else
              gen.nextU32Between(U32.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU32Between(conf.low.get, U32.Max)
            else
             gen.nextU32Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  U64 ==========
    def get_Config_U64: Config_U64
    def set_Config_U64(config: Config_U64): RandomLib

    def nextU64(): U64 = {
      val conf = get_Config_U64

      var r: U64 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextU64()
          else
            gen.nextU64Between(U64.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextU64Between(conf.low.get, U64.Max)
          else
            gen.nextU64Between(conf.low.get, conf.high.get)
        }

      if(get_Config_U64.attempts >= 0) {
       for (i <- 0 to get_Config_U64.attempts) {
         if (get_Config_U64.filter(r)) {
           return r
         }
         if (get_Config_U64.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU64()
           else
              gen.nextU64Between(U64.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU64Between(conf.low.get, U64.Max)
            else
             gen.nextU64Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_U64.filter(r)) {
           return r
         }
         if (get_Config_U64.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU64()
           else
              gen.nextU64Between(U64.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU64Between(conf.low.get, U64.Max)
            else
             gen.nextU64Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ============= String ===================

  def get_Config_String: Config_String
  def set_Config_String(config: Config_String): RandomLib

  def nextString(): String = {

    var length: Z = gen.nextZBetween(get_Config_String.minSize, get_Config_String.maxSize)
    var str: String = ""
    for(r <- 0 until length){
      str = s"${str}${nextC().string}"
    }

    if(get_Config_String.attempts >= 0) {
      for (i <- 0 to get_Config_String.attempts) {
        if(get_Config_String.filter(str)) {
          return str
        }
        if(get_Config_String.verbose) {
          println(s"Retrying for failing value: $str")
        }

        length = gen.nextZBetween(get_Config_String.minSize, get_Config_String.maxSize)
        str = ""
        for (r <- 0 until length) {
          str = s"${str}${nextC().string}"
        }
      }
    } else {
      while(T) {
        if (get_Config_String.filter(str)) {
          return str
        }
        if (get_Config_String.verbose) {
          println(s"Retrying for failing value: $str")
        }

        length = gen.nextZBetween(get_Config_String.minSize, get_Config_String.maxSize)
        str = ""
        for (r <- 0 until length) {
          str = s"${str}${nextC().string}"
        }
      }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= art.DataContent ===================

  def get_Config__artDataContent: Config__artDataContent
  def set_Config__artDataContent(config: Config__artDataContent): RandomLib

  def next_artDataContent(): art.DataContent = {
    var callEnum: ISZ[_artDataContent_DataTypeId.Type] = ISZ(_artDataContent_DataTypeId._artEmpty_Id, _artDataContent_DataTypeId.Base_TypesBits_Payload_Id, _artDataContent_DataTypeId.Base_TypesBoolean_Payload_Id, _artDataContent_DataTypeId.Base_TypesCharacter_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_16_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_8_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_Payload_Id, _artDataContent_DataTypeId.Base_TypesString_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_16_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_8_Payload_Id, _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESFanAck_Payload_Id, _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESFanCmd_Payload_Id, _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P_Id, _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS_Id, _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P_Id, _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS_Id, _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESSetPoint_Payload_Id, _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P_Id, _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS_Id, _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P_Id, _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS_Id, _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P_Id, _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS_Id, _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P_Id, _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS_Id, _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempUnit_Payload_Id, _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTemperature_Payload_Id, _artDataContent_DataTypeId.utilEmptyContainer_Id)

    if(get_Config__artDataContent.additiveTypeFiltering) {
       callEnum = get_Config__artDataContent.typeFilter
    } else {
       for(h <- get_Config__artDataContent.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: art.DataContent = c match {
      case _artDataContent_DataTypeId._artEmpty_Id => (next_artEmpty _).apply()
      case _artDataContent_DataTypeId.Base_TypesBits_Payload_Id => (nextBase_TypesBits_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesBoolean_Payload_Id => (nextBase_TypesBoolean_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesCharacter_Payload_Id => (nextBase_TypesCharacter_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesFloat_32_Payload_Id => (nextBase_TypesFloat_32_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesFloat_64_Payload_Id => (nextBase_TypesFloat_64_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesFloat_Payload_Id => (nextBase_TypesFloat_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesInteger_16_Payload_Id => (nextBase_TypesInteger_16_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesInteger_32_Payload_Id => (nextBase_TypesInteger_32_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesInteger_64_Payload_Id => (nextBase_TypesInteger_64_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesInteger_8_Payload_Id => (nextBase_TypesInteger_8_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesInteger_Payload_Id => (nextBase_TypesInteger_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesString_Payload_Id => (nextBase_TypesString_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesUnsigned_16_Payload_Id => (nextBase_TypesUnsigned_16_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesUnsigned_32_Payload_Id => (nextBase_TypesUnsigned_32_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesUnsigned_64_Payload_Id => (nextBase_TypesUnsigned_64_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesUnsigned_8_Payload_Id => (nextBase_TypesUnsigned_8_Payload _).apply()
      case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESFanAck_Payload_Id => (nextTempControlMixedSeL4CAmKESFanAck_Payload _).apply()
      case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESFanCmd_Payload_Id => (nextTempControlMixedSeL4CAmKESFanCmd_Payload _).apply()
      case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESSetPoint_Payload_Id => (nextTempControlMixedSeL4CAmKESSetPoint_Payload _).apply()
      case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempUnit_Payload_Id => (nextTempControlMixedSeL4CAmKESTempUnit_Payload _).apply()
      case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTemperature_Payload_Id => (nextTempControlMixedSeL4CAmKESTemperature_Payload _).apply()
      case _artDataContent_DataTypeId.utilEmptyContainer_Id => (nextutilEmptyContainer _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config__artDataContent.attempts >= 0) {
     for(i <- 0 to get_Config__artDataContent.attempts) {
       if(get_Config__artDataContent.filter(v)) {
        return v
       }
       if (get_Config__artDataContent.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case _artDataContent_DataTypeId._artEmpty_Id => (next_artEmpty _).apply()
         case _artDataContent_DataTypeId.Base_TypesBits_Payload_Id => (nextBase_TypesBits_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesBoolean_Payload_Id => (nextBase_TypesBoolean_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesCharacter_Payload_Id => (nextBase_TypesCharacter_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesFloat_32_Payload_Id => (nextBase_TypesFloat_32_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesFloat_64_Payload_Id => (nextBase_TypesFloat_64_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesFloat_Payload_Id => (nextBase_TypesFloat_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_16_Payload_Id => (nextBase_TypesInteger_16_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_32_Payload_Id => (nextBase_TypesInteger_32_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_64_Payload_Id => (nextBase_TypesInteger_64_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_8_Payload_Id => (nextBase_TypesInteger_8_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_Payload_Id => (nextBase_TypesInteger_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesString_Payload_Id => (nextBase_TypesString_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_16_Payload_Id => (nextBase_TypesUnsigned_16_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_32_Payload_Id => (nextBase_TypesUnsigned_32_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_64_Payload_Id => (nextBase_TypesUnsigned_64_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_8_Payload_Id => (nextBase_TypesUnsigned_8_Payload _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESFanAck_Payload_Id => (nextTempControlMixedSeL4CAmKESFanAck_Payload _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESFanCmd_Payload_Id => (nextTempControlMixedSeL4CAmKESFanCmd_Payload _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESSetPoint_Payload_Id => (nextTempControlMixedSeL4CAmKESSetPoint_Payload _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempUnit_Payload_Id => (nextTempControlMixedSeL4CAmKESTempUnit_Payload _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTemperature_Payload_Id => (nextTempControlMixedSeL4CAmKESTemperature_Payload _).apply()
         case _artDataContent_DataTypeId.utilEmptyContainer_Id => (nextutilEmptyContainer _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config__artDataContent.filter(v)) {
         return v
       }
       if (get_Config__artDataContent.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case _artDataContent_DataTypeId._artEmpty_Id => (next_artEmpty _).apply()
         case _artDataContent_DataTypeId.Base_TypesBits_Payload_Id => (nextBase_TypesBits_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesBoolean_Payload_Id => (nextBase_TypesBoolean_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesCharacter_Payload_Id => (nextBase_TypesCharacter_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesFloat_32_Payload_Id => (nextBase_TypesFloat_32_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesFloat_64_Payload_Id => (nextBase_TypesFloat_64_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesFloat_Payload_Id => (nextBase_TypesFloat_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_16_Payload_Id => (nextBase_TypesInteger_16_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_32_Payload_Id => (nextBase_TypesInteger_32_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_64_Payload_Id => (nextBase_TypesInteger_64_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_8_Payload_Id => (nextBase_TypesInteger_8_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_Payload_Id => (nextBase_TypesInteger_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesString_Payload_Id => (nextBase_TypesString_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_16_Payload_Id => (nextBase_TypesUnsigned_16_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_32_Payload_Id => (nextBase_TypesUnsigned_32_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_64_Payload_Id => (nextBase_TypesUnsigned_64_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_8_Payload_Id => (nextBase_TypesUnsigned_8_Payload _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESFanAck_Payload_Id => (nextTempControlMixedSeL4CAmKESFanAck_Payload _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESFanCmd_Payload_Id => (nextTempControlMixedSeL4CAmKESFanCmd_Payload _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESSetPoint_Payload_Id => (nextTempControlMixedSeL4CAmKESSetPoint_Payload _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTempUnit_Payload_Id => (nextTempControlMixedSeL4CAmKESTempUnit_Payload _).apply()
         case _artDataContent_DataTypeId.TempControlMixedSeL4CAmKESTemperature_Payload_Id => (nextTempControlMixedSeL4CAmKESTemperature_Payload _).apply()
         case _artDataContent_DataTypeId.utilEmptyContainer_Id => (nextutilEmptyContainer _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= art.Empty ===================

  def get_Config__artEmpty: Config__artEmpty
  def set_Config__artEmpty(config: Config__artEmpty): RandomLib

  def next_artEmpty(): art.Empty = {

    var v: art.Empty = art.Empty()

    if(get_Config__artEmpty.attempts >= 0) {
     for(i <- 0 to get_Config__artEmpty.attempts) {
        if(get_Config__artEmpty.filter(v)) {
          return v
        }
        if (get_Config__artEmpty.verbose) {
          println(s"Retrying for failing value: $v")
        }
        v = art.Empty()
     }
    } else {
     while(T) {
       if(get_Config__artEmpty.filter(v)) {
         return v
       }
       if (get_Config__artEmpty.verbose) {
         println(s"Retrying for failing value: $v")
       }
       v = art.Empty()
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Boolean_Payload ===================

  def get_Config_Base_TypesBoolean_Payload: Config_Base_TypesBoolean_Payload
  def set_Config_Base_TypesBoolean_Payload(config: Config_Base_TypesBoolean_Payload): RandomLib

  def nextBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
    var value: B = nextB()

    var v: Base_Types.Boolean_Payload = Base_Types.Boolean_Payload(value)

    if(get_Config_Base_TypesBoolean_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesBoolean_Payload.attempts) {
        if(get_Config_Base_TypesBoolean_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesBoolean_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextB()
        v = Base_Types.Boolean_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesBoolean_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesBoolean_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextB()
       v = Base_Types.Boolean_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Integer_Payload ===================

  def get_Config_Base_TypesInteger_Payload: Config_Base_TypesInteger_Payload
  def set_Config_Base_TypesInteger_Payload(config: Config_Base_TypesInteger_Payload): RandomLib

  def nextBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
    var value: Z = nextZ()

    var v: Base_Types.Integer_Payload = Base_Types.Integer_Payload(value)

    if(get_Config_Base_TypesInteger_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesInteger_Payload.attempts) {
        if(get_Config_Base_TypesInteger_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesInteger_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextZ()
        v = Base_Types.Integer_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesInteger_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesInteger_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextZ()
       v = Base_Types.Integer_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Integer_8_Payload ===================

  def get_Config_Base_TypesInteger_8_Payload: Config_Base_TypesInteger_8_Payload
  def set_Config_Base_TypesInteger_8_Payload(config: Config_Base_TypesInteger_8_Payload): RandomLib

  def nextBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
    var value: S8 = nextS8()

    var v: Base_Types.Integer_8_Payload = Base_Types.Integer_8_Payload(value)

    if(get_Config_Base_TypesInteger_8_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesInteger_8_Payload.attempts) {
        if(get_Config_Base_TypesInteger_8_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesInteger_8_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextS8()
        v = Base_Types.Integer_8_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesInteger_8_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesInteger_8_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextS8()
       v = Base_Types.Integer_8_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Integer_16_Payload ===================

  def get_Config_Base_TypesInteger_16_Payload: Config_Base_TypesInteger_16_Payload
  def set_Config_Base_TypesInteger_16_Payload(config: Config_Base_TypesInteger_16_Payload): RandomLib

  def nextBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
    var value: S16 = nextS16()

    var v: Base_Types.Integer_16_Payload = Base_Types.Integer_16_Payload(value)

    if(get_Config_Base_TypesInteger_16_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesInteger_16_Payload.attempts) {
        if(get_Config_Base_TypesInteger_16_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesInteger_16_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextS16()
        v = Base_Types.Integer_16_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesInteger_16_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesInteger_16_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextS16()
       v = Base_Types.Integer_16_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Integer_32_Payload ===================

  def get_Config_Base_TypesInteger_32_Payload: Config_Base_TypesInteger_32_Payload
  def set_Config_Base_TypesInteger_32_Payload(config: Config_Base_TypesInteger_32_Payload): RandomLib

  def nextBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
    var value: S32 = nextS32()

    var v: Base_Types.Integer_32_Payload = Base_Types.Integer_32_Payload(value)

    if(get_Config_Base_TypesInteger_32_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesInteger_32_Payload.attempts) {
        if(get_Config_Base_TypesInteger_32_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesInteger_32_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextS32()
        v = Base_Types.Integer_32_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesInteger_32_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesInteger_32_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextS32()
       v = Base_Types.Integer_32_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Integer_64_Payload ===================

  def get_Config_Base_TypesInteger_64_Payload: Config_Base_TypesInteger_64_Payload
  def set_Config_Base_TypesInteger_64_Payload(config: Config_Base_TypesInteger_64_Payload): RandomLib

  def nextBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
    var value: S64 = nextS64()

    var v: Base_Types.Integer_64_Payload = Base_Types.Integer_64_Payload(value)

    if(get_Config_Base_TypesInteger_64_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesInteger_64_Payload.attempts) {
        if(get_Config_Base_TypesInteger_64_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesInteger_64_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextS64()
        v = Base_Types.Integer_64_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesInteger_64_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesInteger_64_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextS64()
       v = Base_Types.Integer_64_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Unsigned_8_Payload ===================

  def get_Config_Base_TypesUnsigned_8_Payload: Config_Base_TypesUnsigned_8_Payload
  def set_Config_Base_TypesUnsigned_8_Payload(config: Config_Base_TypesUnsigned_8_Payload): RandomLib

  def nextBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
    var value: U8 = nextU8()

    var v: Base_Types.Unsigned_8_Payload = Base_Types.Unsigned_8_Payload(value)

    if(get_Config_Base_TypesUnsigned_8_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesUnsigned_8_Payload.attempts) {
        if(get_Config_Base_TypesUnsigned_8_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesUnsigned_8_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextU8()
        v = Base_Types.Unsigned_8_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesUnsigned_8_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesUnsigned_8_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextU8()
       v = Base_Types.Unsigned_8_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Unsigned_16_Payload ===================

  def get_Config_Base_TypesUnsigned_16_Payload: Config_Base_TypesUnsigned_16_Payload
  def set_Config_Base_TypesUnsigned_16_Payload(config: Config_Base_TypesUnsigned_16_Payload): RandomLib

  def nextBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
    var value: U16 = nextU16()

    var v: Base_Types.Unsigned_16_Payload = Base_Types.Unsigned_16_Payload(value)

    if(get_Config_Base_TypesUnsigned_16_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesUnsigned_16_Payload.attempts) {
        if(get_Config_Base_TypesUnsigned_16_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesUnsigned_16_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextU16()
        v = Base_Types.Unsigned_16_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesUnsigned_16_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesUnsigned_16_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextU16()
       v = Base_Types.Unsigned_16_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Unsigned_32_Payload ===================

  def get_Config_Base_TypesUnsigned_32_Payload: Config_Base_TypesUnsigned_32_Payload
  def set_Config_Base_TypesUnsigned_32_Payload(config: Config_Base_TypesUnsigned_32_Payload): RandomLib

  def nextBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
    var value: U32 = nextU32()

    var v: Base_Types.Unsigned_32_Payload = Base_Types.Unsigned_32_Payload(value)

    if(get_Config_Base_TypesUnsigned_32_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesUnsigned_32_Payload.attempts) {
        if(get_Config_Base_TypesUnsigned_32_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesUnsigned_32_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextU32()
        v = Base_Types.Unsigned_32_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesUnsigned_32_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesUnsigned_32_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextU32()
       v = Base_Types.Unsigned_32_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Unsigned_64_Payload ===================

  def get_Config_Base_TypesUnsigned_64_Payload: Config_Base_TypesUnsigned_64_Payload
  def set_Config_Base_TypesUnsigned_64_Payload(config: Config_Base_TypesUnsigned_64_Payload): RandomLib

  def nextBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
    var value: U64 = nextU64()

    var v: Base_Types.Unsigned_64_Payload = Base_Types.Unsigned_64_Payload(value)

    if(get_Config_Base_TypesUnsigned_64_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesUnsigned_64_Payload.attempts) {
        if(get_Config_Base_TypesUnsigned_64_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesUnsigned_64_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextU64()
        v = Base_Types.Unsigned_64_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesUnsigned_64_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesUnsigned_64_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextU64()
       v = Base_Types.Unsigned_64_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Float_Payload ===================

  def get_Config_Base_TypesFloat_Payload: Config_Base_TypesFloat_Payload
  def set_Config_Base_TypesFloat_Payload(config: Config_Base_TypesFloat_Payload): RandomLib

  def nextBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
    var value: R = nextR()

    var v: Base_Types.Float_Payload = Base_Types.Float_Payload(value)

    if(get_Config_Base_TypesFloat_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesFloat_Payload.attempts) {
        if(get_Config_Base_TypesFloat_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesFloat_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextR()
        v = Base_Types.Float_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesFloat_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesFloat_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextR()
       v = Base_Types.Float_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Float_32_Payload ===================

  def get_Config_Base_TypesFloat_32_Payload: Config_Base_TypesFloat_32_Payload
  def set_Config_Base_TypesFloat_32_Payload(config: Config_Base_TypesFloat_32_Payload): RandomLib

  def nextBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
    var value: F32 = nextF32()

    var v: Base_Types.Float_32_Payload = Base_Types.Float_32_Payload(value)

    if(get_Config_Base_TypesFloat_32_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesFloat_32_Payload.attempts) {
        if(get_Config_Base_TypesFloat_32_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesFloat_32_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextF32()
        v = Base_Types.Float_32_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesFloat_32_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesFloat_32_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextF32()
       v = Base_Types.Float_32_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Float_64_Payload ===================

  def get_Config_Base_TypesFloat_64_Payload: Config_Base_TypesFloat_64_Payload
  def set_Config_Base_TypesFloat_64_Payload(config: Config_Base_TypesFloat_64_Payload): RandomLib

  def nextBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
    var value: F64 = nextF64()

    var v: Base_Types.Float_64_Payload = Base_Types.Float_64_Payload(value)

    if(get_Config_Base_TypesFloat_64_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesFloat_64_Payload.attempts) {
        if(get_Config_Base_TypesFloat_64_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesFloat_64_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextF64()
        v = Base_Types.Float_64_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesFloat_64_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesFloat_64_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextF64()
       v = Base_Types.Float_64_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Character_Payload ===================

  def get_Config_Base_TypesCharacter_Payload: Config_Base_TypesCharacter_Payload
  def set_Config_Base_TypesCharacter_Payload(config: Config_Base_TypesCharacter_Payload): RandomLib

  def nextBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
    var value: C = nextC()

    var v: Base_Types.Character_Payload = Base_Types.Character_Payload(value)

    if(get_Config_Base_TypesCharacter_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesCharacter_Payload.attempts) {
        if(get_Config_Base_TypesCharacter_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesCharacter_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextC()
        v = Base_Types.Character_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesCharacter_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesCharacter_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextC()
       v = Base_Types.Character_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.String_Payload ===================

  def get_Config_Base_TypesString_Payload: Config_Base_TypesString_Payload
  def set_Config_Base_TypesString_Payload(config: Config_Base_TypesString_Payload): RandomLib

  def nextBase_TypesString_Payload(): Base_Types.String_Payload = {
    var value: String = nextString()

    var v: Base_Types.String_Payload = Base_Types.String_Payload(value)

    if(get_Config_Base_TypesString_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesString_Payload.attempts) {
        if(get_Config_Base_TypesString_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesString_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextString()
        v = Base_Types.String_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesString_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesString_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextString()
       v = Base_Types.String_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  //=================== ISZ[B] =====================
  def get_Config_ISZB: Config_ISZB
  def set_Config_ISZB(config: Config_ISZB): RandomLib

  def nextISZB(): ISZ[B] = {

    var length: Z = gen.nextZBetween(0, get_numElement)
    var v: ISZ[B] = ISZ()
    for (r <- 0 until length) {
      v = v :+ nextB()
    }

    if(get_Config_ISZB.attempts >= 0) {
     for(i <- 0 to get_Config_ISZB.attempts) {
        if(get_Config_ISZB.filter(v)) {
          return v
        }
        if (get_Config_ISZB.verbose) {
          println(s"Retrying for failing value: $v")
        }

        length = gen.nextZBetween(0, get_numElement)
        v = ISZ()
        for (r <- 0 until length) {
           v = v :+ nextB()
        }
     }
    } else {
     while(T) {
       if(get_Config_ISZB.filter(v)) {
         return v
       }
       if (get_Config_ISZB.verbose) {
         println(s"Retrying for failing value: $v")
       }

       length = gen.nextZBetween(0, get_numElement)
       v = ISZ()
       for (r <- 0 until length) {
          v = v :+ nextB()
       }
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Bits_Payload ===================

  def get_Config_Base_TypesBits_Payload: Config_Base_TypesBits_Payload
  def set_Config_Base_TypesBits_Payload(config: Config_Base_TypesBits_Payload): RandomLib

  def nextBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
    var value: ISZ[B] = nextISZB()

    var v: Base_Types.Bits_Payload = Base_Types.Bits_Payload(value)

    if(get_Config_Base_TypesBits_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesBits_Payload.attempts) {
        if(get_Config_Base_TypesBits_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesBits_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextISZB()
        v = Base_Types.Bits_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesBits_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesBits_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextISZB()
       v = Base_Types.Bits_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlMixedSeL4CAmKES.FanAck.Type ===================

  def get_Config_TempControlMixedSeL4CAmKESFanAckType: Config_TempControlMixedSeL4CAmKESFanAckType
  def set_Config_TempControlMixedSeL4CAmKESFanAckType(config: Config_TempControlMixedSeL4CAmKESFanAckType): RandomLib

  def nextTempControlMixedSeL4CAmKESFanAckType(): TempControlMixedSeL4CAmKES.FanAck.Type = {

    var ordinal: Z = gen.nextZBetween(0, tc.TempControlMixedSeL4CAmKES.FanAck.numOfElements-1)

    var v: TempControlMixedSeL4CAmKES.FanAck.Type = tc.TempControlMixedSeL4CAmKES.FanAck.byOrdinal(ordinal).get
    if(get_Config_TempControlMixedSeL4CAmKESFanAckType.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlMixedSeL4CAmKESFanAckType.attempts) {
       if(get_Config_TempControlMixedSeL4CAmKESFanAckType.filter(v)) {
        return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESFanAckType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, tc.TempControlMixedSeL4CAmKES.FanAck.numOfElements-1)
       v = tc.TempControlMixedSeL4CAmKES.FanAck.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_TempControlMixedSeL4CAmKESFanAckType.filter(v)) {
        return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESFanAckType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, tc.TempControlMixedSeL4CAmKES.FanAck.numOfElements-1)
       v = tc.TempControlMixedSeL4CAmKES.FanAck.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlMixedSeL4CAmKES.FanAck_Payload ===================

  def get_Config_TempControlMixedSeL4CAmKESFanAck_Payload: Config_TempControlMixedSeL4CAmKESFanAck_Payload
  def set_Config_TempControlMixedSeL4CAmKESFanAck_Payload(config: Config_TempControlMixedSeL4CAmKESFanAck_Payload): RandomLib

  def nextTempControlMixedSeL4CAmKESFanAck_Payload(): TempControlMixedSeL4CAmKES.FanAck_Payload = {
    var value: TempControlMixedSeL4CAmKES.FanAck.Type = nextTempControlMixedSeL4CAmKESFanAckType()

    var v: TempControlMixedSeL4CAmKES.FanAck_Payload = TempControlMixedSeL4CAmKES.FanAck_Payload(value)

    if(get_Config_TempControlMixedSeL4CAmKESFanAck_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlMixedSeL4CAmKESFanAck_Payload.attempts) {
        if(get_Config_TempControlMixedSeL4CAmKESFanAck_Payload.filter(v)) {
          return v
        }
        if (get_Config_TempControlMixedSeL4CAmKESFanAck_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextTempControlMixedSeL4CAmKESFanAckType()
        v = TempControlMixedSeL4CAmKES.FanAck_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_TempControlMixedSeL4CAmKESFanAck_Payload.filter(v)) {
         return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESFanAck_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextTempControlMixedSeL4CAmKESFanAckType()
       v = TempControlMixedSeL4CAmKES.FanAck_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlMixedSeL4CAmKES.FanCmd.Type ===================

  def get_Config_TempControlMixedSeL4CAmKESFanCmdType: Config_TempControlMixedSeL4CAmKESFanCmdType
  def set_Config_TempControlMixedSeL4CAmKESFanCmdType(config: Config_TempControlMixedSeL4CAmKESFanCmdType): RandomLib

  def nextTempControlMixedSeL4CAmKESFanCmdType(): TempControlMixedSeL4CAmKES.FanCmd.Type = {

    var ordinal: Z = gen.nextZBetween(0, tc.TempControlMixedSeL4CAmKES.FanCmd.numOfElements-1)

    var v: TempControlMixedSeL4CAmKES.FanCmd.Type = tc.TempControlMixedSeL4CAmKES.FanCmd.byOrdinal(ordinal).get
    if(get_Config_TempControlMixedSeL4CAmKESFanCmdType.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlMixedSeL4CAmKESFanCmdType.attempts) {
       if(get_Config_TempControlMixedSeL4CAmKESFanCmdType.filter(v)) {
        return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESFanCmdType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, tc.TempControlMixedSeL4CAmKES.FanCmd.numOfElements-1)
       v = tc.TempControlMixedSeL4CAmKES.FanCmd.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_TempControlMixedSeL4CAmKESFanCmdType.filter(v)) {
        return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESFanCmdType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, tc.TempControlMixedSeL4CAmKES.FanCmd.numOfElements-1)
       v = tc.TempControlMixedSeL4CAmKES.FanCmd.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlMixedSeL4CAmKES.FanCmd_Payload ===================

  def get_Config_TempControlMixedSeL4CAmKESFanCmd_Payload: Config_TempControlMixedSeL4CAmKESFanCmd_Payload
  def set_Config_TempControlMixedSeL4CAmKESFanCmd_Payload(config: Config_TempControlMixedSeL4CAmKESFanCmd_Payload): RandomLib

  def nextTempControlMixedSeL4CAmKESFanCmd_Payload(): TempControlMixedSeL4CAmKES.FanCmd_Payload = {
    var value: TempControlMixedSeL4CAmKES.FanCmd.Type = nextTempControlMixedSeL4CAmKESFanCmdType()

    var v: TempControlMixedSeL4CAmKES.FanCmd_Payload = TempControlMixedSeL4CAmKES.FanCmd_Payload(value)

    if(get_Config_TempControlMixedSeL4CAmKESFanCmd_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlMixedSeL4CAmKESFanCmd_Payload.attempts) {
        if(get_Config_TempControlMixedSeL4CAmKESFanCmd_Payload.filter(v)) {
          return v
        }
        if (get_Config_TempControlMixedSeL4CAmKESFanCmd_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextTempControlMixedSeL4CAmKESFanCmdType()
        v = TempControlMixedSeL4CAmKES.FanCmd_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_TempControlMixedSeL4CAmKESFanCmd_Payload.filter(v)) {
         return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESFanCmd_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextTempControlMixedSeL4CAmKESFanCmdType()
       v = TempControlMixedSeL4CAmKES.FanCmd_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container ===================

  def get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container
  def set_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container(config: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container): RandomLib

  def nextTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container(): TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container = {
    var callEnum: ISZ[TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_DataTypeId.Type] = ISZ(TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P_Id, TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS_Id)

    if(get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container = c match {
      case TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P _).apply()
      case TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container.attempts) {
       if(get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P _).apply()
         case TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P _).apply()
         case TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  //=================== Option[TempControlMixedSeL4CAmKES.FanCmd.Type] =====================
  def get_Config_OptionTempControlMixedSeL4CAmKESFanCmdType: Config_OptionTempControlMixedSeL4CAmKESFanCmdType
  def set_Config_OptionTempControlMixedSeL4CAmKESFanCmdType(config: Config_OptionTempControlMixedSeL4CAmKESFanCmdType): RandomLib

  def nextOptionTempControlMixedSeL4CAmKESFanCmdType(): Option[TempControlMixedSeL4CAmKES.FanCmd.Type] = {

    var none: Z = gen.nextZBetween(0,1)
    var v: Option[TempControlMixedSeL4CAmKES.FanCmd.Type] = if(none == 0) {
      Some(nextTempControlMixedSeL4CAmKESFanCmdType())
    } else {
      None()
    }

    if(get_Config_OptionTempControlMixedSeL4CAmKESFanCmdType.attempts >= 0) {
     for(i <- 0 to get_Config_OptionTempControlMixedSeL4CAmKESFanCmdType.attempts) {
        if(get_Config_OptionTempControlMixedSeL4CAmKESFanCmdType.filter(v)) {
          return v
        }
        if (get_Config_OptionTempControlMixedSeL4CAmKESFanCmdType.verbose) {
          println(s"Retrying for failing value: $v")
        }

        none = gen.nextZBetween(0,1)
        v = if(none == 0) {
           Some(nextTempControlMixedSeL4CAmKESFanCmdType())
        } else {
           None()
        }
     }
    } else {
     while(T) {
       if(get_Config_OptionTempControlMixedSeL4CAmKESFanCmdType.filter(v)) {
         return v
       }
       if (get_Config_OptionTempControlMixedSeL4CAmKESFanCmdType.verbose) {
         println(s"Retrying for failing value: $v")
       }

       none = gen.nextZBetween(0,1)
       v = if(none == 0) {
          Some(nextTempControlMixedSeL4CAmKESFanCmdType())
       } else {
          None()
       }
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P ===================

  def get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P
  def set_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P(config: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P): RandomLib

  def nextTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P(): TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P = {
    var api_fanCmd: Option[TempControlMixedSeL4CAmKES.FanCmd.Type] = nextOptionTempControlMixedSeL4CAmKESFanCmdType()

    var v: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P = TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P(api_fanCmd)

    if(get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P.attempts) {
        if(get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_fanCmd = nextOptionTempControlMixedSeL4CAmKESFanCmdType()
        v = TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P(api_fanCmd)
     }
    } else {
     while(T) {
       if(get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_fanCmd = nextOptionTempControlMixedSeL4CAmKESFanCmdType()
       v = TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P(api_fanCmd)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS ===================

  def get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS
  def set_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS(config: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS): RandomLib

  def nextTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS(): TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS = {
    var api_fanCmd: Option[TempControlMixedSeL4CAmKES.FanCmd.Type] = nextOptionTempControlMixedSeL4CAmKESFanCmdType()

    var v: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS = TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS(api_fanCmd)

    if(get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS.attempts) {
        if(get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_fanCmd = nextOptionTempControlMixedSeL4CAmKESFanCmdType()
        v = TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS(api_fanCmd)
     }
    } else {
     while(T) {
       if(get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_fanCmd = nextOptionTempControlMixedSeL4CAmKESFanCmdType()
       v = TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS(api_fanCmd)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container ===================

  def get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container
  def set_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container(config: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container): RandomLib

  def nextTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container(): TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container = {
    var callEnum: ISZ[TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_DataTypeId.Type] = ISZ(TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P_Id, TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS_Id)

    if(get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container = c match {
      case TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P _).apply()
      case TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container.attempts) {
       if(get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P _).apply()
         case TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P _).apply()
         case TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  //=================== Option[TempControlMixedSeL4CAmKES.FanAck.Type] =====================
  def get_Config_OptionTempControlMixedSeL4CAmKESFanAckType: Config_OptionTempControlMixedSeL4CAmKESFanAckType
  def set_Config_OptionTempControlMixedSeL4CAmKESFanAckType(config: Config_OptionTempControlMixedSeL4CAmKESFanAckType): RandomLib

  def nextOptionTempControlMixedSeL4CAmKESFanAckType(): Option[TempControlMixedSeL4CAmKES.FanAck.Type] = {

    var none: Z = gen.nextZBetween(0,1)
    var v: Option[TempControlMixedSeL4CAmKES.FanAck.Type] = if(none == 0) {
      Some(nextTempControlMixedSeL4CAmKESFanAckType())
    } else {
      None()
    }

    if(get_Config_OptionTempControlMixedSeL4CAmKESFanAckType.attempts >= 0) {
     for(i <- 0 to get_Config_OptionTempControlMixedSeL4CAmKESFanAckType.attempts) {
        if(get_Config_OptionTempControlMixedSeL4CAmKESFanAckType.filter(v)) {
          return v
        }
        if (get_Config_OptionTempControlMixedSeL4CAmKESFanAckType.verbose) {
          println(s"Retrying for failing value: $v")
        }

        none = gen.nextZBetween(0,1)
        v = if(none == 0) {
           Some(nextTempControlMixedSeL4CAmKESFanAckType())
        } else {
           None()
        }
     }
    } else {
     while(T) {
       if(get_Config_OptionTempControlMixedSeL4CAmKESFanAckType.filter(v)) {
         return v
       }
       if (get_Config_OptionTempControlMixedSeL4CAmKESFanAckType.verbose) {
         println(s"Retrying for failing value: $v")
       }

       none = gen.nextZBetween(0,1)
       v = if(none == 0) {
          Some(nextTempControlMixedSeL4CAmKESFanAckType())
       } else {
          None()
       }
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P ===================

  def get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P
  def set_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P(config: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P): RandomLib

  def nextTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P(): TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P = {
    var api_fanAck: Option[TempControlMixedSeL4CAmKES.FanAck.Type] = nextOptionTempControlMixedSeL4CAmKESFanAckType()

    var v: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P = TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P(api_fanAck)

    if(get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P.attempts) {
        if(get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_fanAck = nextOptionTempControlMixedSeL4CAmKESFanAckType()
        v = TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P(api_fanAck)
     }
    } else {
     while(T) {
       if(get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_fanAck = nextOptionTempControlMixedSeL4CAmKESFanAckType()
       v = TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P(api_fanAck)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS ===================

  def get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS
  def set_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS(config: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS): RandomLib

  def nextTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS(): TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS = {
    var api_fanAck: Option[TempControlMixedSeL4CAmKES.FanAck.Type] = nextOptionTempControlMixedSeL4CAmKESFanAckType()

    var v: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS = TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS(api_fanAck)

    if(get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS.attempts) {
        if(get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_fanAck = nextOptionTempControlMixedSeL4CAmKESFanAckType()
        v = TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS(api_fanAck)
     }
    } else {
     while(T) {
       if(get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_fanAck = nextOptionTempControlMixedSeL4CAmKESFanAckType()
       v = TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS(api_fanAck)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlMixedSeL4CAmKES.SetPoint ===================

  def get_Config_TempControlMixedSeL4CAmKESSetPoint: Config_TempControlMixedSeL4CAmKESSetPoint
  def set_Config_TempControlMixedSeL4CAmKESSetPoint(config: Config_TempControlMixedSeL4CAmKESSetPoint): RandomLib

  def nextTempControlMixedSeL4CAmKESSetPoint(): TempControlMixedSeL4CAmKES.SetPoint = {
    var low: TempControlMixedSeL4CAmKES.Temperature = nextTempControlMixedSeL4CAmKESTemperature()
    var high: TempControlMixedSeL4CAmKES.Temperature = nextTempControlMixedSeL4CAmKESTemperature()

    var v: TempControlMixedSeL4CAmKES.SetPoint = TempControlMixedSeL4CAmKES.SetPoint(low, high)

    if(get_Config_TempControlMixedSeL4CAmKESSetPoint.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlMixedSeL4CAmKESSetPoint.attempts) {
        if(get_Config_TempControlMixedSeL4CAmKESSetPoint.filter(v)) {
          return v
        }
        if (get_Config_TempControlMixedSeL4CAmKESSetPoint.verbose) {
          println(s"Retrying for failing value: $v")
        }
        low = nextTempControlMixedSeL4CAmKESTemperature()
        high = nextTempControlMixedSeL4CAmKESTemperature()
        v = TempControlMixedSeL4CAmKES.SetPoint(low, high)
     }
    } else {
     while(T) {
       if(get_Config_TempControlMixedSeL4CAmKESSetPoint.filter(v)) {
         return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESSetPoint.verbose) {
         println(s"Retrying for failing value: $v")
       }
       low = nextTempControlMixedSeL4CAmKESTemperature()
       high = nextTempControlMixedSeL4CAmKESTemperature()
       v = TempControlMixedSeL4CAmKES.SetPoint(low, high)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlMixedSeL4CAmKES.SetPoint_Payload ===================

  def get_Config_TempControlMixedSeL4CAmKESSetPoint_Payload: Config_TempControlMixedSeL4CAmKESSetPoint_Payload
  def set_Config_TempControlMixedSeL4CAmKESSetPoint_Payload(config: Config_TempControlMixedSeL4CAmKESSetPoint_Payload): RandomLib

  def nextTempControlMixedSeL4CAmKESSetPoint_Payload(): TempControlMixedSeL4CAmKES.SetPoint_Payload = {
    var value: TempControlMixedSeL4CAmKES.SetPoint = nextTempControlMixedSeL4CAmKESSetPoint()

    var v: TempControlMixedSeL4CAmKES.SetPoint_Payload = TempControlMixedSeL4CAmKES.SetPoint_Payload(value)

    if(get_Config_TempControlMixedSeL4CAmKESSetPoint_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlMixedSeL4CAmKESSetPoint_Payload.attempts) {
        if(get_Config_TempControlMixedSeL4CAmKESSetPoint_Payload.filter(v)) {
          return v
        }
        if (get_Config_TempControlMixedSeL4CAmKESSetPoint_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextTempControlMixedSeL4CAmKESSetPoint()
        v = TempControlMixedSeL4CAmKES.SetPoint_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_TempControlMixedSeL4CAmKESSetPoint_Payload.filter(v)) {
         return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESSetPoint_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextTempControlMixedSeL4CAmKESSetPoint()
       v = TempControlMixedSeL4CAmKES.SetPoint_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container ===================

  def get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container
  def set_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container(config: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container): RandomLib

  def nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container(): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container = {
    var callEnum: ISZ[TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_DataTypeId.Type] = ISZ(TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P_Id, TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS_Id)

    if(get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container = c match {
      case TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P _).apply()
      case TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container.attempts) {
       if(get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P _).apply()
         case TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P _).apply()
         case TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  //=================== Option[art.Empty] =====================
  def get_Config_Option_artEmpty: Config_Option_artEmpty
  def set_Config_Option_artEmpty(config: Config_Option_artEmpty): RandomLib

  def nextOption_artEmpty(): Option[art.Empty] = {

    var none: Z = gen.nextZBetween(0,1)
    var v: Option[art.Empty] = if(none == 0) {
      Some(next_artEmpty())
    } else {
      None()
    }

    if(get_Config_Option_artEmpty.attempts >= 0) {
     for(i <- 0 to get_Config_Option_artEmpty.attempts) {
        if(get_Config_Option_artEmpty.filter(v)) {
          return v
        }
        if (get_Config_Option_artEmpty.verbose) {
          println(s"Retrying for failing value: $v")
        }

        none = gen.nextZBetween(0,1)
        v = if(none == 0) {
           Some(next_artEmpty())
        } else {
           None()
        }
     }
    } else {
     while(T) {
       if(get_Config_Option_artEmpty.filter(v)) {
         return v
       }
       if (get_Config_Option_artEmpty.verbose) {
         println(s"Retrying for failing value: $v")
       }

       none = gen.nextZBetween(0,1)
       v = if(none == 0) {
          Some(next_artEmpty())
       } else {
          None()
       }
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  //=================== Option[TempControlMixedSeL4CAmKES.SetPoint] =====================
  def get_Config_OptionTempControlMixedSeL4CAmKESSetPoint: Config_OptionTempControlMixedSeL4CAmKESSetPoint
  def set_Config_OptionTempControlMixedSeL4CAmKESSetPoint(config: Config_OptionTempControlMixedSeL4CAmKESSetPoint): RandomLib

  def nextOptionTempControlMixedSeL4CAmKESSetPoint(): Option[TempControlMixedSeL4CAmKES.SetPoint] = {

    var none: Z = gen.nextZBetween(0,1)
    var v: Option[TempControlMixedSeL4CAmKES.SetPoint] = if(none == 0) {
      Some(nextTempControlMixedSeL4CAmKESSetPoint())
    } else {
      None()
    }

    if(get_Config_OptionTempControlMixedSeL4CAmKESSetPoint.attempts >= 0) {
     for(i <- 0 to get_Config_OptionTempControlMixedSeL4CAmKESSetPoint.attempts) {
        if(get_Config_OptionTempControlMixedSeL4CAmKESSetPoint.filter(v)) {
          return v
        }
        if (get_Config_OptionTempControlMixedSeL4CAmKESSetPoint.verbose) {
          println(s"Retrying for failing value: $v")
        }

        none = gen.nextZBetween(0,1)
        v = if(none == 0) {
           Some(nextTempControlMixedSeL4CAmKESSetPoint())
        } else {
           None()
        }
     }
    } else {
     while(T) {
       if(get_Config_OptionTempControlMixedSeL4CAmKESSetPoint.filter(v)) {
         return v
       }
       if (get_Config_OptionTempControlMixedSeL4CAmKESSetPoint.verbose) {
         println(s"Retrying for failing value: $v")
       }

       none = gen.nextZBetween(0,1)
       v = if(none == 0) {
          Some(nextTempControlMixedSeL4CAmKESSetPoint())
       } else {
          None()
       }
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P ===================

  def get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P
  def set_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P(config: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P): RandomLib

  def nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P(): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P = {
    var api_tempChanged: Option[art.Empty] = nextOption_artEmpty()
    var api_fanAck: Option[TempControlMixedSeL4CAmKES.FanAck.Type] = nextOptionTempControlMixedSeL4CAmKESFanAckType()
    var api_setPoint: Option[TempControlMixedSeL4CAmKES.SetPoint] = nextOptionTempControlMixedSeL4CAmKESSetPoint()
    var api_currentTemp: TempControlMixedSeL4CAmKES.Temperature = nextTempControlMixedSeL4CAmKESTemperature()

    var v: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P = TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P(api_tempChanged, api_fanAck, api_setPoint, api_currentTemp)

    if(get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P.attempts) {
        if(get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_tempChanged = nextOption_artEmpty()
        api_fanAck = nextOptionTempControlMixedSeL4CAmKESFanAckType()
        api_setPoint = nextOptionTempControlMixedSeL4CAmKESSetPoint()
        api_currentTemp = nextTempControlMixedSeL4CAmKESTemperature()
        v = TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P(api_tempChanged, api_fanAck, api_setPoint, api_currentTemp)
     }
    } else {
     while(T) {
       if(get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_tempChanged = nextOption_artEmpty()
       api_fanAck = nextOptionTempControlMixedSeL4CAmKESFanAckType()
       api_setPoint = nextOptionTempControlMixedSeL4CAmKESSetPoint()
       api_currentTemp = nextTempControlMixedSeL4CAmKESTemperature()
       v = TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P(api_tempChanged, api_fanAck, api_setPoint, api_currentTemp)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS ===================

  def get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS
  def set_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS(config: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS): RandomLib

  def nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS(): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS = {
    var In_currentFanState: TempControlMixedSeL4CAmKES.FanCmd.Type = nextTempControlMixedSeL4CAmKESFanCmdType()
    var In_currentSetPoint: TempControlMixedSeL4CAmKES.SetPoint = nextTempControlMixedSeL4CAmKESSetPoint()
    var In_fanError: B = nextB()
    var In_latestTemp: TempControlMixedSeL4CAmKES.Temperature = nextTempControlMixedSeL4CAmKESTemperature()
    var api_tempChanged: Option[art.Empty] = nextOption_artEmpty()
    var api_fanAck: Option[TempControlMixedSeL4CAmKES.FanAck.Type] = nextOptionTempControlMixedSeL4CAmKESFanAckType()
    var api_setPoint: Option[TempControlMixedSeL4CAmKES.SetPoint] = nextOptionTempControlMixedSeL4CAmKESSetPoint()
    var api_currentTemp: TempControlMixedSeL4CAmKES.Temperature = nextTempControlMixedSeL4CAmKESTemperature()

    var v: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS = TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS(In_currentFanState, In_currentSetPoint, In_fanError, In_latestTemp, api_tempChanged, api_fanAck, api_setPoint, api_currentTemp)

    if(get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS.attempts) {
        if(get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        In_currentFanState = nextTempControlMixedSeL4CAmKESFanCmdType()
        In_currentSetPoint = nextTempControlMixedSeL4CAmKESSetPoint()
        In_fanError = nextB()
        In_latestTemp = nextTempControlMixedSeL4CAmKESTemperature()
        api_tempChanged = nextOption_artEmpty()
        api_fanAck = nextOptionTempControlMixedSeL4CAmKESFanAckType()
        api_setPoint = nextOptionTempControlMixedSeL4CAmKESSetPoint()
        api_currentTemp = nextTempControlMixedSeL4CAmKESTemperature()
        v = TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS(In_currentFanState, In_currentSetPoint, In_fanError, In_latestTemp, api_tempChanged, api_fanAck, api_setPoint, api_currentTemp)
     }
    } else {
     while(T) {
       if(get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       In_currentFanState = nextTempControlMixedSeL4CAmKESFanCmdType()
       In_currentSetPoint = nextTempControlMixedSeL4CAmKESSetPoint()
       In_fanError = nextB()
       In_latestTemp = nextTempControlMixedSeL4CAmKESTemperature()
       api_tempChanged = nextOption_artEmpty()
       api_fanAck = nextOptionTempControlMixedSeL4CAmKESFanAckType()
       api_setPoint = nextOptionTempControlMixedSeL4CAmKESSetPoint()
       api_currentTemp = nextTempControlMixedSeL4CAmKESTemperature()
       v = TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS(In_currentFanState, In_currentSetPoint, In_fanError, In_latestTemp, api_tempChanged, api_fanAck, api_setPoint, api_currentTemp)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container ===================

  def get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container
  def set_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container(config: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container): RandomLib

  def nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container(): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container = {
    var callEnum: ISZ[TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_DataTypeId.Type] = ISZ(TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P_Id, TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS_Id)

    if(get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container = c match {
      case TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P _).apply()
      case TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container.attempts) {
       if(get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P _).apply()
         case TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P _).apply()
         case TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P ===================

  def get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P
  def set_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P(config: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P): RandomLib

  def nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P(): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P = {
    var api_fanCmd: Option[TempControlMixedSeL4CAmKES.FanCmd.Type] = nextOptionTempControlMixedSeL4CAmKESFanCmdType()

    var v: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P = TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P(api_fanCmd)

    if(get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P.attempts) {
        if(get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_fanCmd = nextOptionTempControlMixedSeL4CAmKESFanCmdType()
        v = TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P(api_fanCmd)
     }
    } else {
     while(T) {
       if(get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_fanCmd = nextOptionTempControlMixedSeL4CAmKESFanCmdType()
       v = TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P(api_fanCmd)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS ===================

  def get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS
  def set_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS(config: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS): RandomLib

  def nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS(): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS = {
    var currentFanState: TempControlMixedSeL4CAmKES.FanCmd.Type = nextTempControlMixedSeL4CAmKESFanCmdType()
    var currentSetPoint: TempControlMixedSeL4CAmKES.SetPoint = nextTempControlMixedSeL4CAmKESSetPoint()
    var fanError: B = nextB()
    var latestTemp: TempControlMixedSeL4CAmKES.Temperature = nextTempControlMixedSeL4CAmKESTemperature()
    var api_fanCmd: Option[TempControlMixedSeL4CAmKES.FanCmd.Type] = nextOptionTempControlMixedSeL4CAmKESFanCmdType()

    var v: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS = TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS(currentFanState, currentSetPoint, fanError, latestTemp, api_fanCmd)

    if(get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS.attempts) {
        if(get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        currentFanState = nextTempControlMixedSeL4CAmKESFanCmdType()
        currentSetPoint = nextTempControlMixedSeL4CAmKESSetPoint()
        fanError = nextB()
        latestTemp = nextTempControlMixedSeL4CAmKESTemperature()
        api_fanCmd = nextOptionTempControlMixedSeL4CAmKESFanCmdType()
        v = TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS(currentFanState, currentSetPoint, fanError, latestTemp, api_fanCmd)
     }
    } else {
     while(T) {
       if(get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       currentFanState = nextTempControlMixedSeL4CAmKESFanCmdType()
       currentSetPoint = nextTempControlMixedSeL4CAmKESSetPoint()
       fanError = nextB()
       latestTemp = nextTempControlMixedSeL4CAmKESTemperature()
       api_fanCmd = nextOptionTempControlMixedSeL4CAmKESFanCmdType()
       v = TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS(currentFanState, currentSetPoint, fanError, latestTemp, api_fanCmd)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container ===================

  def get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container
  def set_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container(config: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container): RandomLib

  def nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container(): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container = {
    var callEnum: ISZ[TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_DataTypeId.Type] = ISZ(TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P_Id, TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS_Id)

    if(get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container = c match {
      case TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P _).apply()
      case TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container.attempts) {
       if(get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P _).apply()
         case TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P _).apply()
         case TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P ===================

  def get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P
  def set_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P(config: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P): RandomLib

  def nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P(): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P = {

    var v: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P = TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P()

    if(get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P.attempts) {
        if(get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        v = TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P()
     }
    } else {
     while(T) {
       if(get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       v = TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P()
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS ===================

  def get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS
  def set_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS(config: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS): RandomLib

  def nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS(): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS = {

    var v: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS = TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS()

    if(get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS.attempts) {
        if(get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        v = TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS()
     }
    } else {
     while(T) {
       if(get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       v = TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS()
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container ===================

  def get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container
  def set_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container(config: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container): RandomLib

  def nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container(): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container = {
    var callEnum: ISZ[TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_DataTypeId.Type] = ISZ(TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P_Id, TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS_Id)

    if(get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container = c match {
      case TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P _).apply()
      case TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container.attempts) {
       if(get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P _).apply()
         case TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P _).apply()
         case TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P ===================

  def get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P
  def set_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P(config: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P): RandomLib

  def nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P(): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P = {
    var api_tempChanged: Option[art.Empty] = nextOption_artEmpty()
    var api_currentTemp: TempControlMixedSeL4CAmKES.Temperature = nextTempControlMixedSeL4CAmKESTemperature()

    var v: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P = TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P(api_tempChanged, api_currentTemp)

    if(get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P.attempts) {
        if(get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_tempChanged = nextOption_artEmpty()
        api_currentTemp = nextTempControlMixedSeL4CAmKESTemperature()
        v = TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P(api_tempChanged, api_currentTemp)
     }
    } else {
     while(T) {
       if(get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_tempChanged = nextOption_artEmpty()
       api_currentTemp = nextTempControlMixedSeL4CAmKESTemperature()
       v = TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P(api_tempChanged, api_currentTemp)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS ===================

  def get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS
  def set_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS(config: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS): RandomLib

  def nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS(): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS = {
    var api_tempChanged: Option[art.Empty] = nextOption_artEmpty()
    var api_currentTemp: TempControlMixedSeL4CAmKES.Temperature = nextTempControlMixedSeL4CAmKESTemperature()

    var v: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS = TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS(api_tempChanged, api_currentTemp)

    if(get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS.attempts) {
        if(get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_tempChanged = nextOption_artEmpty()
        api_currentTemp = nextTempControlMixedSeL4CAmKESTemperature()
        v = TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS(api_tempChanged, api_currentTemp)
     }
    } else {
     while(T) {
       if(get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_tempChanged = nextOption_artEmpty()
       api_currentTemp = nextTempControlMixedSeL4CAmKESTemperature()
       v = TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS(api_tempChanged, api_currentTemp)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlMixedSeL4CAmKES.TempUnit.Type ===================

  def get_Config_TempControlMixedSeL4CAmKESTempUnitType: Config_TempControlMixedSeL4CAmKESTempUnitType
  def set_Config_TempControlMixedSeL4CAmKESTempUnitType(config: Config_TempControlMixedSeL4CAmKESTempUnitType): RandomLib

  def nextTempControlMixedSeL4CAmKESTempUnitType(): TempControlMixedSeL4CAmKES.TempUnit.Type = {

    var ordinal: Z = gen.nextZBetween(0, tc.TempControlMixedSeL4CAmKES.TempUnit.numOfElements-1)

    var v: TempControlMixedSeL4CAmKES.TempUnit.Type = tc.TempControlMixedSeL4CAmKES.TempUnit.byOrdinal(ordinal).get
    if(get_Config_TempControlMixedSeL4CAmKESTempUnitType.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlMixedSeL4CAmKESTempUnitType.attempts) {
       if(get_Config_TempControlMixedSeL4CAmKESTempUnitType.filter(v)) {
        return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESTempUnitType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, tc.TempControlMixedSeL4CAmKES.TempUnit.numOfElements-1)
       v = tc.TempControlMixedSeL4CAmKES.TempUnit.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_TempControlMixedSeL4CAmKESTempUnitType.filter(v)) {
        return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESTempUnitType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, tc.TempControlMixedSeL4CAmKES.TempUnit.numOfElements-1)
       v = tc.TempControlMixedSeL4CAmKES.TempUnit.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlMixedSeL4CAmKES.TempUnit_Payload ===================

  def get_Config_TempControlMixedSeL4CAmKESTempUnit_Payload: Config_TempControlMixedSeL4CAmKESTempUnit_Payload
  def set_Config_TempControlMixedSeL4CAmKESTempUnit_Payload(config: Config_TempControlMixedSeL4CAmKESTempUnit_Payload): RandomLib

  def nextTempControlMixedSeL4CAmKESTempUnit_Payload(): TempControlMixedSeL4CAmKES.TempUnit_Payload = {
    var value: TempControlMixedSeL4CAmKES.TempUnit.Type = nextTempControlMixedSeL4CAmKESTempUnitType()

    var v: TempControlMixedSeL4CAmKES.TempUnit_Payload = TempControlMixedSeL4CAmKES.TempUnit_Payload(value)

    if(get_Config_TempControlMixedSeL4CAmKESTempUnit_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlMixedSeL4CAmKESTempUnit_Payload.attempts) {
        if(get_Config_TempControlMixedSeL4CAmKESTempUnit_Payload.filter(v)) {
          return v
        }
        if (get_Config_TempControlMixedSeL4CAmKESTempUnit_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextTempControlMixedSeL4CAmKESTempUnitType()
        v = TempControlMixedSeL4CAmKES.TempUnit_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_TempControlMixedSeL4CAmKESTempUnit_Payload.filter(v)) {
         return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESTempUnit_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextTempControlMixedSeL4CAmKESTempUnitType()
       v = TempControlMixedSeL4CAmKES.TempUnit_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlMixedSeL4CAmKES.Temperature ===================

  def get_Config_TempControlMixedSeL4CAmKESTemperature: Config_TempControlMixedSeL4CAmKESTemperature
  def set_Config_TempControlMixedSeL4CAmKESTemperature(config: Config_TempControlMixedSeL4CAmKESTemperature): RandomLib

  def nextTempControlMixedSeL4CAmKESTemperature(): TempControlMixedSeL4CAmKES.Temperature = {
    var degrees: F32 = nextF32()
    var unit: TempControlMixedSeL4CAmKES.TempUnit.Type = nextTempControlMixedSeL4CAmKESTempUnitType()

    var v: TempControlMixedSeL4CAmKES.Temperature = TempControlMixedSeL4CAmKES.Temperature(degrees, unit)

    if(get_Config_TempControlMixedSeL4CAmKESTemperature.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlMixedSeL4CAmKESTemperature.attempts) {
        if(get_Config_TempControlMixedSeL4CAmKESTemperature.filter(v)) {
          return v
        }
        if (get_Config_TempControlMixedSeL4CAmKESTemperature.verbose) {
          println(s"Retrying for failing value: $v")
        }
        degrees = nextF32()
        unit = nextTempControlMixedSeL4CAmKESTempUnitType()
        v = TempControlMixedSeL4CAmKES.Temperature(degrees, unit)
     }
    } else {
     while(T) {
       if(get_Config_TempControlMixedSeL4CAmKESTemperature.filter(v)) {
         return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESTemperature.verbose) {
         println(s"Retrying for failing value: $v")
       }
       degrees = nextF32()
       unit = nextTempControlMixedSeL4CAmKESTempUnitType()
       v = TempControlMixedSeL4CAmKES.Temperature(degrees, unit)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= TempControlMixedSeL4CAmKES.Temperature_Payload ===================

  def get_Config_TempControlMixedSeL4CAmKESTemperature_Payload: Config_TempControlMixedSeL4CAmKESTemperature_Payload
  def set_Config_TempControlMixedSeL4CAmKESTemperature_Payload(config: Config_TempControlMixedSeL4CAmKESTemperature_Payload): RandomLib

  def nextTempControlMixedSeL4CAmKESTemperature_Payload(): TempControlMixedSeL4CAmKES.Temperature_Payload = {
    var value: TempControlMixedSeL4CAmKES.Temperature = nextTempControlMixedSeL4CAmKESTemperature()

    var v: TempControlMixedSeL4CAmKES.Temperature_Payload = TempControlMixedSeL4CAmKES.Temperature_Payload(value)

    if(get_Config_TempControlMixedSeL4CAmKESTemperature_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_TempControlMixedSeL4CAmKESTemperature_Payload.attempts) {
        if(get_Config_TempControlMixedSeL4CAmKESTemperature_Payload.filter(v)) {
          return v
        }
        if (get_Config_TempControlMixedSeL4CAmKESTemperature_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextTempControlMixedSeL4CAmKESTemperature()
        v = TempControlMixedSeL4CAmKES.Temperature_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_TempControlMixedSeL4CAmKESTemperature_Payload.filter(v)) {
         return v
       }
       if (get_Config_TempControlMixedSeL4CAmKESTemperature_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextTempControlMixedSeL4CAmKESTemperature()
       v = TempControlMixedSeL4CAmKES.Temperature_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= util.Container ===================

  def get_Config_utilContainer: Config_utilContainer
  def set_Config_utilContainer(config: Config_utilContainer): RandomLib

  def nextutilContainer(): util.Container = {
    var callEnum: ISZ[utilContainer_DataTypeId.Type] = ISZ(utilContainer_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P_Id, utilContainer_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS_Id, utilContainer_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P_Id, utilContainer_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS_Id, utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P_Id, utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS_Id, utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P_Id, utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS_Id, utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P_Id, utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS_Id, utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P_Id, utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS_Id, utilContainer_DataTypeId.utilEmptyContainer_Id)

    if(get_Config_utilContainer.additiveTypeFiltering) {
       callEnum = get_Config_utilContainer.typeFilter
    } else {
       for(h <- get_Config_utilContainer.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: util.Container = c match {
      case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P _).apply()
      case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS _).apply()
      case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P _).apply()
      case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS _).apply()
      case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P _).apply()
      case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS _).apply()
      case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P _).apply()
      case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS _).apply()
      case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P _).apply()
      case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS _).apply()
      case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P _).apply()
      case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS _).apply()
      case utilContainer_DataTypeId.utilEmptyContainer_Id => (nextutilEmptyContainer _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_utilContainer.attempts >= 0) {
     for(i <- 0 to get_Config_utilContainer.attempts) {
       if(get_Config_utilContainer.filter(v)) {
        return v
       }
       if (get_Config_utilContainer.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.utilEmptyContainer_Id => (nextutilEmptyContainer _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_utilContainer.filter(v)) {
         return v
       }
       if (get_Config_utilContainer.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS_Id => (nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.utilEmptyContainer_Id => (nextutilEmptyContainer _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= util.EmptyContainer ===================

  def get_Config_utilEmptyContainer: Config_utilEmptyContainer
  def set_Config_utilEmptyContainer(config: Config_utilEmptyContainer): RandomLib

  def nextutilEmptyContainer(): util.EmptyContainer = {

    var v: util.EmptyContainer = util.EmptyContainer()

    if(get_Config_utilEmptyContainer.attempts >= 0) {
     for(i <- 0 to get_Config_utilEmptyContainer.attempts) {
        if(get_Config_utilEmptyContainer.filter(v)) {
          return v
        }
        if (get_Config_utilEmptyContainer.verbose) {
          println(s"Retrying for failing value: $v")
        }
        v = util.EmptyContainer()
     }
    } else {
     while(T) {
       if(get_Config_utilEmptyContainer.filter(v)) {
         return v
       }
       if (get_Config_utilEmptyContainer.verbose) {
         println(s"Retrying for failing value: $v")
       }
       v = util.EmptyContainer()
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

}

@record class RandomLib(val gen: org.sireum.Random.Gen) extends RandomLibI {

  var numElem: Z = 50

  var _verbose: B = F
  def verbose: RandomLib = {
    _verbose = !_verbose
    return this
  }

  def get_numElement: Z = {return numElem}

  def set_numElement(s: Z): Unit ={
    numElem = s
  }

  // ============= String =============

  def alwaysTrue_String(v: String): B = {return T}

  var config_String: Config_String = Config_String(0, numElem, 100, _verbose, alwaysTrue_String _)

  def get_Config_String: Config_String = {return config_String}

  def set_Config_String(config: Config_String): RandomLib = {
    config_String = config
    return this
  }

  // ============= Z ===================
  def alwaysTrue_Z(v: Z): B = {return T}

  var config_Z: Config_Z = Config_Z(None(), None(), 100, _verbose, alwaysTrue_Z _)
  def get_Config_Z: Config_Z = {return config_Z}

  def set_Config_Z(config: Config_Z): RandomLib ={
    config_Z = config
    return this
  }

  // ============= B ===================
  def alwaysTrue_B(v: B): B = {return T}

  var config_B: Config_B = Config_B(100, _verbose, alwaysTrue_B _)
  def get_Config_B: Config_B = {return config_B}

  def set_Config_B(config: Config_B): RandomLib ={
    config_B = config
    return this
  }

  // ============= C ===================
  def alwaysTrue_C(v: C): B = {return T}

  var config_C: Config_C = Config_C(None(), None(), 100, _verbose, alwaysTrue_C _)
  def get_Config_C: Config_C = {return config_C}

  def set_Config_C(config: Config_C): RandomLib ={
    config_C = config
    return this
  }

  // ============= R ===================
  def alwaysTrue_R(v: R): B = {return T}

  var config_R: Config_R = Config_R(None(), None(), 100, _verbose, alwaysTrue_R _)
  def get_Config_R: Config_R = {return config_R}

  def set_Config_R(config: Config_R): RandomLib ={
    config_R = config
    return this
  }

  // ============= F32 ===================
  def alwaysTrue_F32(v: F32): B = {return T}

  var config_F32: Config_F32 = Config_F32(None(), None(), 100, _verbose, alwaysTrue_F32 _)
  def get_Config_F32: Config_F32 = {return config_F32}

  def set_Config_F32(config: Config_F32): RandomLib ={
    config_F32 = config
    return this
  }

  // ============= F64 ===================
  def alwaysTrue_F64(v: F64): B = {return T}

  var config_F64: Config_F64 = Config_F64(None(), None(), 100, _verbose, alwaysTrue_F64 _)
  def get_Config_F64: Config_F64 = {return config_F64}

  def set_Config_F64(config: Config_F64): RandomLib ={
    config_F64 = config
    return this
  }

  // ============= S8 ===================
  def alwaysTrue_S8(v: S8): B = {return T}

  var config_S8: Config_S8 = Config_S8(None(), None(), 100, _verbose, alwaysTrue_S8 _)
  def get_Config_S8: Config_S8 = {return config_S8}

  def set_Config_S8(config: Config_S8): RandomLib ={
    config_S8 = config
    return this
  }

  // ============= S16 ===================
  def alwaysTrue_S16(v: S16): B = {return T}

  var config_S16: Config_S16 = Config_S16(None(), None(), 100, _verbose, alwaysTrue_S16 _)
  def get_Config_S16: Config_S16 = {return config_S16}

  def set_Config_S16(config: Config_S16): RandomLib ={
    config_S16 = config
    return this
  }

  // ============= S32 ===================
  def alwaysTrue_S32(v: S32): B = {return T}

  var config_S32: Config_S32 = Config_S32(None(), None(), 100, _verbose, alwaysTrue_S32 _)
  def get_Config_S32: Config_S32 = {return config_S32}

  def set_Config_S32(config: Config_S32): RandomLib ={
    config_S32 = config
    return this
  }

  // ============= S64 ===================
  def alwaysTrue_S64(v: S64): B = {return T}

  var config_S64: Config_S64 = Config_S64(None(), None(), 100, _verbose, alwaysTrue_S64 _)
  def get_Config_S64: Config_S64 = {return config_S64}

  def set_Config_S64(config: Config_S64): RandomLib ={
    config_S64 = config
    return this
  }

  // ============= U8 ===================
  def alwaysTrue_U8(v: U8): B = {return T}

  var config_U8: Config_U8 = Config_U8(None(), None(), 100, _verbose, alwaysTrue_U8 _)
  def get_Config_U8: Config_U8 = {return config_U8}

  def set_Config_U8(config: Config_U8): RandomLib ={
    config_U8 = config
    return this
  }

  // ============= U16 ===================
  def alwaysTrue_U16(v: U16): B = {return T}

  var config_U16: Config_U16 = Config_U16(None(), None(), 100, _verbose, alwaysTrue_U16 _)
  def get_Config_U16: Config_U16 = {return config_U16}

  def set_Config_U16(config: Config_U16): RandomLib ={
    config_U16 = config
    return this
  }

  // ============= U32 ===================
  def alwaysTrue_U32(v: U32): B = {return T}

  var config_U32: Config_U32 = Config_U32(None(), None(), 100, _verbose, alwaysTrue_U32 _)
  def get_Config_U32: Config_U32 = {return config_U32}

  def set_Config_U32(config: Config_U32): RandomLib ={
    config_U32 = config
    return this
  }

  // ============= U64 ===================
  def alwaysTrue_U64(v: U64): B = {return T}

  var config_U64: Config_U64 = Config_U64(None(), None(), 100, _verbose, alwaysTrue_U64 _)
  def get_Config_U64: Config_U64 = {return config_U64}

  def set_Config_U64(config: Config_U64): RandomLib ={
    config_U64 = config
    return this
  }

  // ============= art.DataContent ===================
  def alwaysTrue__artDataContent(v: art.DataContent): B = {return T}

  var config__artDataContent: Config__artDataContent = Config__artDataContent(100, _verbose, F, ISZ(), alwaysTrue__artDataContent _)

  def get_Config__artDataContent: Config__artDataContent = {return config__artDataContent}

  def set_Config__artDataContent(config: Config__artDataContent): RandomLib ={
    config__artDataContent = config
    return this
  }

  // ============= art.Empty ===================
  def alwaysTrue__artEmpty(v: art.Empty): B = {return T}

  var config__artEmpty: Config__artEmpty = Config__artEmpty(100, _verbose, alwaysTrue__artEmpty _)

  def get_Config__artEmpty: Config__artEmpty = {return config__artEmpty}

  def set_Config__artEmpty(config: Config__artEmpty): RandomLib ={
    config__artEmpty = config
    return this
  }

  // ============= Base_Types.Boolean_Payload ===================
  def alwaysTrue_Base_TypesBoolean_Payload(v: Base_Types.Boolean_Payload): B = {return T}

  var config_Base_TypesBoolean_Payload: Config_Base_TypesBoolean_Payload = Config_Base_TypesBoolean_Payload(100, _verbose, alwaysTrue_Base_TypesBoolean_Payload _)

  def get_Config_Base_TypesBoolean_Payload: Config_Base_TypesBoolean_Payload = {return config_Base_TypesBoolean_Payload}

  def set_Config_Base_TypesBoolean_Payload(config: Config_Base_TypesBoolean_Payload): RandomLib ={
    config_Base_TypesBoolean_Payload = config
    return this
  }

  // ============= Base_Types.Integer_Payload ===================
  def alwaysTrue_Base_TypesInteger_Payload(v: Base_Types.Integer_Payload): B = {return T}

  var config_Base_TypesInteger_Payload: Config_Base_TypesInteger_Payload = Config_Base_TypesInteger_Payload(100, _verbose, alwaysTrue_Base_TypesInteger_Payload _)

  def get_Config_Base_TypesInteger_Payload: Config_Base_TypesInteger_Payload = {return config_Base_TypesInteger_Payload}

  def set_Config_Base_TypesInteger_Payload(config: Config_Base_TypesInteger_Payload): RandomLib ={
    config_Base_TypesInteger_Payload = config
    return this
  }

  // ============= Base_Types.Integer_8_Payload ===================
  def alwaysTrue_Base_TypesInteger_8_Payload(v: Base_Types.Integer_8_Payload): B = {return T}

  var config_Base_TypesInteger_8_Payload: Config_Base_TypesInteger_8_Payload = Config_Base_TypesInteger_8_Payload(100, _verbose, alwaysTrue_Base_TypesInteger_8_Payload _)

  def get_Config_Base_TypesInteger_8_Payload: Config_Base_TypesInteger_8_Payload = {return config_Base_TypesInteger_8_Payload}

  def set_Config_Base_TypesInteger_8_Payload(config: Config_Base_TypesInteger_8_Payload): RandomLib ={
    config_Base_TypesInteger_8_Payload = config
    return this
  }

  // ============= Base_Types.Integer_16_Payload ===================
  def alwaysTrue_Base_TypesInteger_16_Payload(v: Base_Types.Integer_16_Payload): B = {return T}

  var config_Base_TypesInteger_16_Payload: Config_Base_TypesInteger_16_Payload = Config_Base_TypesInteger_16_Payload(100, _verbose, alwaysTrue_Base_TypesInteger_16_Payload _)

  def get_Config_Base_TypesInteger_16_Payload: Config_Base_TypesInteger_16_Payload = {return config_Base_TypesInteger_16_Payload}

  def set_Config_Base_TypesInteger_16_Payload(config: Config_Base_TypesInteger_16_Payload): RandomLib ={
    config_Base_TypesInteger_16_Payload = config
    return this
  }

  // ============= Base_Types.Integer_32_Payload ===================
  def alwaysTrue_Base_TypesInteger_32_Payload(v: Base_Types.Integer_32_Payload): B = {return T}

  var config_Base_TypesInteger_32_Payload: Config_Base_TypesInteger_32_Payload = Config_Base_TypesInteger_32_Payload(100, _verbose, alwaysTrue_Base_TypesInteger_32_Payload _)

  def get_Config_Base_TypesInteger_32_Payload: Config_Base_TypesInteger_32_Payload = {return config_Base_TypesInteger_32_Payload}

  def set_Config_Base_TypesInteger_32_Payload(config: Config_Base_TypesInteger_32_Payload): RandomLib ={
    config_Base_TypesInteger_32_Payload = config
    return this
  }

  // ============= Base_Types.Integer_64_Payload ===================
  def alwaysTrue_Base_TypesInteger_64_Payload(v: Base_Types.Integer_64_Payload): B = {return T}

  var config_Base_TypesInteger_64_Payload: Config_Base_TypesInteger_64_Payload = Config_Base_TypesInteger_64_Payload(100, _verbose, alwaysTrue_Base_TypesInteger_64_Payload _)

  def get_Config_Base_TypesInteger_64_Payload: Config_Base_TypesInteger_64_Payload = {return config_Base_TypesInteger_64_Payload}

  def set_Config_Base_TypesInteger_64_Payload(config: Config_Base_TypesInteger_64_Payload): RandomLib ={
    config_Base_TypesInteger_64_Payload = config
    return this
  }

  // ============= Base_Types.Unsigned_8_Payload ===================
  def alwaysTrue_Base_TypesUnsigned_8_Payload(v: Base_Types.Unsigned_8_Payload): B = {return T}

  var config_Base_TypesUnsigned_8_Payload: Config_Base_TypesUnsigned_8_Payload = Config_Base_TypesUnsigned_8_Payload(100, _verbose, alwaysTrue_Base_TypesUnsigned_8_Payload _)

  def get_Config_Base_TypesUnsigned_8_Payload: Config_Base_TypesUnsigned_8_Payload = {return config_Base_TypesUnsigned_8_Payload}

  def set_Config_Base_TypesUnsigned_8_Payload(config: Config_Base_TypesUnsigned_8_Payload): RandomLib ={
    config_Base_TypesUnsigned_8_Payload = config
    return this
  }

  // ============= Base_Types.Unsigned_16_Payload ===================
  def alwaysTrue_Base_TypesUnsigned_16_Payload(v: Base_Types.Unsigned_16_Payload): B = {return T}

  var config_Base_TypesUnsigned_16_Payload: Config_Base_TypesUnsigned_16_Payload = Config_Base_TypesUnsigned_16_Payload(100, _verbose, alwaysTrue_Base_TypesUnsigned_16_Payload _)

  def get_Config_Base_TypesUnsigned_16_Payload: Config_Base_TypesUnsigned_16_Payload = {return config_Base_TypesUnsigned_16_Payload}

  def set_Config_Base_TypesUnsigned_16_Payload(config: Config_Base_TypesUnsigned_16_Payload): RandomLib ={
    config_Base_TypesUnsigned_16_Payload = config
    return this
  }

  // ============= Base_Types.Unsigned_32_Payload ===================
  def alwaysTrue_Base_TypesUnsigned_32_Payload(v: Base_Types.Unsigned_32_Payload): B = {return T}

  var config_Base_TypesUnsigned_32_Payload: Config_Base_TypesUnsigned_32_Payload = Config_Base_TypesUnsigned_32_Payload(100, _verbose, alwaysTrue_Base_TypesUnsigned_32_Payload _)

  def get_Config_Base_TypesUnsigned_32_Payload: Config_Base_TypesUnsigned_32_Payload = {return config_Base_TypesUnsigned_32_Payload}

  def set_Config_Base_TypesUnsigned_32_Payload(config: Config_Base_TypesUnsigned_32_Payload): RandomLib ={
    config_Base_TypesUnsigned_32_Payload = config
    return this
  }

  // ============= Base_Types.Unsigned_64_Payload ===================
  def alwaysTrue_Base_TypesUnsigned_64_Payload(v: Base_Types.Unsigned_64_Payload): B = {return T}

  var config_Base_TypesUnsigned_64_Payload: Config_Base_TypesUnsigned_64_Payload = Config_Base_TypesUnsigned_64_Payload(100, _verbose, alwaysTrue_Base_TypesUnsigned_64_Payload _)

  def get_Config_Base_TypesUnsigned_64_Payload: Config_Base_TypesUnsigned_64_Payload = {return config_Base_TypesUnsigned_64_Payload}

  def set_Config_Base_TypesUnsigned_64_Payload(config: Config_Base_TypesUnsigned_64_Payload): RandomLib ={
    config_Base_TypesUnsigned_64_Payload = config
    return this
  }

  // ============= Base_Types.Float_Payload ===================
  def alwaysTrue_Base_TypesFloat_Payload(v: Base_Types.Float_Payload): B = {return T}

  var config_Base_TypesFloat_Payload: Config_Base_TypesFloat_Payload = Config_Base_TypesFloat_Payload(100, _verbose, alwaysTrue_Base_TypesFloat_Payload _)

  def get_Config_Base_TypesFloat_Payload: Config_Base_TypesFloat_Payload = {return config_Base_TypesFloat_Payload}

  def set_Config_Base_TypesFloat_Payload(config: Config_Base_TypesFloat_Payload): RandomLib ={
    config_Base_TypesFloat_Payload = config
    return this
  }

  // ============= Base_Types.Float_32_Payload ===================
  def alwaysTrue_Base_TypesFloat_32_Payload(v: Base_Types.Float_32_Payload): B = {return T}

  var config_Base_TypesFloat_32_Payload: Config_Base_TypesFloat_32_Payload = Config_Base_TypesFloat_32_Payload(100, _verbose, alwaysTrue_Base_TypesFloat_32_Payload _)

  def get_Config_Base_TypesFloat_32_Payload: Config_Base_TypesFloat_32_Payload = {return config_Base_TypesFloat_32_Payload}

  def set_Config_Base_TypesFloat_32_Payload(config: Config_Base_TypesFloat_32_Payload): RandomLib ={
    config_Base_TypesFloat_32_Payload = config
    return this
  }

  // ============= Base_Types.Float_64_Payload ===================
  def alwaysTrue_Base_TypesFloat_64_Payload(v: Base_Types.Float_64_Payload): B = {return T}

  var config_Base_TypesFloat_64_Payload: Config_Base_TypesFloat_64_Payload = Config_Base_TypesFloat_64_Payload(100, _verbose, alwaysTrue_Base_TypesFloat_64_Payload _)

  def get_Config_Base_TypesFloat_64_Payload: Config_Base_TypesFloat_64_Payload = {return config_Base_TypesFloat_64_Payload}

  def set_Config_Base_TypesFloat_64_Payload(config: Config_Base_TypesFloat_64_Payload): RandomLib ={
    config_Base_TypesFloat_64_Payload = config
    return this
  }

  // ============= Base_Types.Character_Payload ===================
  def alwaysTrue_Base_TypesCharacter_Payload(v: Base_Types.Character_Payload): B = {return T}

  var config_Base_TypesCharacter_Payload: Config_Base_TypesCharacter_Payload = Config_Base_TypesCharacter_Payload(100, _verbose, alwaysTrue_Base_TypesCharacter_Payload _)

  def get_Config_Base_TypesCharacter_Payload: Config_Base_TypesCharacter_Payload = {return config_Base_TypesCharacter_Payload}

  def set_Config_Base_TypesCharacter_Payload(config: Config_Base_TypesCharacter_Payload): RandomLib ={
    config_Base_TypesCharacter_Payload = config
    return this
  }

  // ============= Base_Types.String_Payload ===================
  def alwaysTrue_Base_TypesString_Payload(v: Base_Types.String_Payload): B = {return T}

  var config_Base_TypesString_Payload: Config_Base_TypesString_Payload = Config_Base_TypesString_Payload(100, _verbose, alwaysTrue_Base_TypesString_Payload _)

  def get_Config_Base_TypesString_Payload: Config_Base_TypesString_Payload = {return config_Base_TypesString_Payload}

  def set_Config_Base_TypesString_Payload(config: Config_Base_TypesString_Payload): RandomLib ={
    config_Base_TypesString_Payload = config
    return this
  }

  // ============= ISZ[B] ===================
  def alwaysTrue_ISZB(v: ISZ[B]): B = {return T}

  var config_ISZB: Config_ISZB = Config_ISZB(0, 20, 100, _verbose, alwaysTrue_ISZB _)
  def get_Config_ISZB: Config_ISZB = {return config_ISZB}

  def set_Config_ISZB(config: Config_ISZB): RandomLib ={
    config_ISZB = config
    return this
  }

  // ============= Base_Types.Bits_Payload ===================
  def alwaysTrue_Base_TypesBits_Payload(v: Base_Types.Bits_Payload): B = {return T}

  var config_Base_TypesBits_Payload: Config_Base_TypesBits_Payload = Config_Base_TypesBits_Payload(100, _verbose, alwaysTrue_Base_TypesBits_Payload _)

  def get_Config_Base_TypesBits_Payload: Config_Base_TypesBits_Payload = {return config_Base_TypesBits_Payload}

  def set_Config_Base_TypesBits_Payload(config: Config_Base_TypesBits_Payload): RandomLib ={
    config_Base_TypesBits_Payload = config
    return this
  }

  // ============= TempControlMixedSeL4CAmKES.FanAck.Type ===================
  def alwaysTrue_TempControlMixedSeL4CAmKESFanAckType(v: TempControlMixedSeL4CAmKES.FanAck.Type): B = {return T}

  var config_TempControlMixedSeL4CAmKESFanAckType: Config_TempControlMixedSeL4CAmKESFanAckType = Config_TempControlMixedSeL4CAmKESFanAckType(100, _verbose, alwaysTrue_TempControlMixedSeL4CAmKESFanAckType _)

  def get_Config_TempControlMixedSeL4CAmKESFanAckType: Config_TempControlMixedSeL4CAmKESFanAckType = {return config_TempControlMixedSeL4CAmKESFanAckType}

  def set_Config_TempControlMixedSeL4CAmKESFanAckType(config: Config_TempControlMixedSeL4CAmKESFanAckType): RandomLib ={
    config_TempControlMixedSeL4CAmKESFanAckType = config
    return this
  }

  // ============= TempControlMixedSeL4CAmKES.FanAck_Payload ===================
  def alwaysTrue_TempControlMixedSeL4CAmKESFanAck_Payload(v: TempControlMixedSeL4CAmKES.FanAck_Payload): B = {return T}

  var config_TempControlMixedSeL4CAmKESFanAck_Payload: Config_TempControlMixedSeL4CAmKESFanAck_Payload = Config_TempControlMixedSeL4CAmKESFanAck_Payload(100, _verbose, alwaysTrue_TempControlMixedSeL4CAmKESFanAck_Payload _)

  def get_Config_TempControlMixedSeL4CAmKESFanAck_Payload: Config_TempControlMixedSeL4CAmKESFanAck_Payload = {return config_TempControlMixedSeL4CAmKESFanAck_Payload}

  def set_Config_TempControlMixedSeL4CAmKESFanAck_Payload(config: Config_TempControlMixedSeL4CAmKESFanAck_Payload): RandomLib ={
    config_TempControlMixedSeL4CAmKESFanAck_Payload = config
    return this
  }

  // ============= TempControlMixedSeL4CAmKES.FanCmd.Type ===================
  def alwaysTrue_TempControlMixedSeL4CAmKESFanCmdType(v: TempControlMixedSeL4CAmKES.FanCmd.Type): B = {return T}

  var config_TempControlMixedSeL4CAmKESFanCmdType: Config_TempControlMixedSeL4CAmKESFanCmdType = Config_TempControlMixedSeL4CAmKESFanCmdType(100, _verbose, alwaysTrue_TempControlMixedSeL4CAmKESFanCmdType _)

  def get_Config_TempControlMixedSeL4CAmKESFanCmdType: Config_TempControlMixedSeL4CAmKESFanCmdType = {return config_TempControlMixedSeL4CAmKESFanCmdType}

  def set_Config_TempControlMixedSeL4CAmKESFanCmdType(config: Config_TempControlMixedSeL4CAmKESFanCmdType): RandomLib ={
    config_TempControlMixedSeL4CAmKESFanCmdType = config
    return this
  }

  // ============= TempControlMixedSeL4CAmKES.FanCmd_Payload ===================
  def alwaysTrue_TempControlMixedSeL4CAmKESFanCmd_Payload(v: TempControlMixedSeL4CAmKES.FanCmd_Payload): B = {return T}

  var config_TempControlMixedSeL4CAmKESFanCmd_Payload: Config_TempControlMixedSeL4CAmKESFanCmd_Payload = Config_TempControlMixedSeL4CAmKESFanCmd_Payload(100, _verbose, alwaysTrue_TempControlMixedSeL4CAmKESFanCmd_Payload _)

  def get_Config_TempControlMixedSeL4CAmKESFanCmd_Payload: Config_TempControlMixedSeL4CAmKESFanCmd_Payload = {return config_TempControlMixedSeL4CAmKESFanCmd_Payload}

  def set_Config_TempControlMixedSeL4CAmKESFanCmd_Payload(config: Config_TempControlMixedSeL4CAmKESFanCmd_Payload): RandomLib ={
    config_TempControlMixedSeL4CAmKESFanCmd_Payload = config
    return this
  }

  // ============= TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container ===================
  def alwaysTrue_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container(v: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container): B = {return T}

  var config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container = Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container _)

  def get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container = {return config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container}

  def set_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container(config: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container): RandomLib ={
    config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container = config
    return this
  }

  // ============= Option[TempControlMixedSeL4CAmKES.FanCmd.Type] ===================
  def alwaysTrue_OptionTempControlMixedSeL4CAmKESFanCmdType(v: Option[TempControlMixedSeL4CAmKES.FanCmd.Type]): B = {return T}

  var config_OptionTempControlMixedSeL4CAmKESFanCmdType: Config_OptionTempControlMixedSeL4CAmKESFanCmdType = Config_OptionTempControlMixedSeL4CAmKESFanCmdType(0, 20, 100, _verbose, alwaysTrue_OptionTempControlMixedSeL4CAmKESFanCmdType _)
  def get_Config_OptionTempControlMixedSeL4CAmKESFanCmdType: Config_OptionTempControlMixedSeL4CAmKESFanCmdType = {return config_OptionTempControlMixedSeL4CAmKESFanCmdType}

  def set_Config_OptionTempControlMixedSeL4CAmKESFanCmdType(config: Config_OptionTempControlMixedSeL4CAmKESFanCmdType): RandomLib ={
    config_OptionTempControlMixedSeL4CAmKESFanCmdType = config
    return this
  }

  // ============= TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P ===================
  def alwaysTrue_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P(v: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P): B = {return T}

  var config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P = Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P(100, _verbose, alwaysTrue_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P _)

  def get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P = {return config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P}

  def set_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P(config: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P): RandomLib ={
    config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P = config
    return this
  }

  // ============= TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS ===================
  def alwaysTrue_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS(v: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS): B = {return T}

  var config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS = Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS(100, _verbose, alwaysTrue_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS _)

  def get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS = {return config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS}

  def set_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS(config: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS): RandomLib ={
    config_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS = config
    return this
  }

  // ============= TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container ===================
  def alwaysTrue_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container(v: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container): B = {return T}

  var config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container = Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container _)

  def get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container = {return config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container}

  def set_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container(config: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container): RandomLib ={
    config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container = config
    return this
  }

  // ============= Option[TempControlMixedSeL4CAmKES.FanAck.Type] ===================
  def alwaysTrue_OptionTempControlMixedSeL4CAmKESFanAckType(v: Option[TempControlMixedSeL4CAmKES.FanAck.Type]): B = {return T}

  var config_OptionTempControlMixedSeL4CAmKESFanAckType: Config_OptionTempControlMixedSeL4CAmKESFanAckType = Config_OptionTempControlMixedSeL4CAmKESFanAckType(0, 20, 100, _verbose, alwaysTrue_OptionTempControlMixedSeL4CAmKESFanAckType _)
  def get_Config_OptionTempControlMixedSeL4CAmKESFanAckType: Config_OptionTempControlMixedSeL4CAmKESFanAckType = {return config_OptionTempControlMixedSeL4CAmKESFanAckType}

  def set_Config_OptionTempControlMixedSeL4CAmKESFanAckType(config: Config_OptionTempControlMixedSeL4CAmKESFanAckType): RandomLib ={
    config_OptionTempControlMixedSeL4CAmKESFanAckType = config
    return this
  }

  // ============= TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P ===================
  def alwaysTrue_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P(v: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P): B = {return T}

  var config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P = Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P(100, _verbose, alwaysTrue_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P _)

  def get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P = {return config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P}

  def set_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P(config: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P): RandomLib ={
    config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P = config
    return this
  }

  // ============= TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS ===================
  def alwaysTrue_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS(v: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS): B = {return T}

  var config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS = Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS(100, _verbose, alwaysTrue_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS _)

  def get_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS = {return config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS}

  def set_Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS(config: Config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS): RandomLib ={
    config_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS = config
    return this
  }

  // ============= TempControlMixedSeL4CAmKES.SetPoint ===================
  def alwaysTrue_TempControlMixedSeL4CAmKESSetPoint(v: TempControlMixedSeL4CAmKES.SetPoint): B = {return T}

  var config_TempControlMixedSeL4CAmKESSetPoint: Config_TempControlMixedSeL4CAmKESSetPoint = Config_TempControlMixedSeL4CAmKESSetPoint(100, _verbose, tc.TempControlMixedSeL4CAmKES.SetPoint.D_Inv_SetPoint _)

  def get_Config_TempControlMixedSeL4CAmKESSetPoint: Config_TempControlMixedSeL4CAmKESSetPoint = {return config_TempControlMixedSeL4CAmKESSetPoint}

  def set_Config_TempControlMixedSeL4CAmKESSetPoint(config: Config_TempControlMixedSeL4CAmKESSetPoint): RandomLib ={
    config_TempControlMixedSeL4CAmKESSetPoint = config
    return this
  }

  // ============= TempControlMixedSeL4CAmKES.SetPoint_Payload ===================
  def alwaysTrue_TempControlMixedSeL4CAmKESSetPoint_Payload(v: TempControlMixedSeL4CAmKES.SetPoint_Payload): B = {return T}

  var config_TempControlMixedSeL4CAmKESSetPoint_Payload: Config_TempControlMixedSeL4CAmKESSetPoint_Payload = Config_TempControlMixedSeL4CAmKESSetPoint_Payload(100, _verbose, alwaysTrue_TempControlMixedSeL4CAmKESSetPoint_Payload _)

  def get_Config_TempControlMixedSeL4CAmKESSetPoint_Payload: Config_TempControlMixedSeL4CAmKESSetPoint_Payload = {return config_TempControlMixedSeL4CAmKESSetPoint_Payload}

  def set_Config_TempControlMixedSeL4CAmKESSetPoint_Payload(config: Config_TempControlMixedSeL4CAmKESSetPoint_Payload): RandomLib ={
    config_TempControlMixedSeL4CAmKESSetPoint_Payload = config
    return this
  }

  // ============= TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container ===================
  def alwaysTrue_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container(v: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container): B = {return T}

  var config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container = Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container _)

  def get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container = {return config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container}

  def set_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container(config: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container): RandomLib ={
    config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container = config
    return this
  }

  // ============= Option[art.Empty] ===================
  def alwaysTrue_Option_artEmpty(v: Option[art.Empty]): B = {return T}

  var config_Option_artEmpty: Config_Option_artEmpty = Config_Option_artEmpty(0, 20, 100, _verbose, alwaysTrue_Option_artEmpty _)
  def get_Config_Option_artEmpty: Config_Option_artEmpty = {return config_Option_artEmpty}

  def set_Config_Option_artEmpty(config: Config_Option_artEmpty): RandomLib ={
    config_Option_artEmpty = config
    return this
  }

  // ============= Option[TempControlMixedSeL4CAmKES.SetPoint] ===================
  def alwaysTrue_OptionTempControlMixedSeL4CAmKESSetPoint(v: Option[TempControlMixedSeL4CAmKES.SetPoint]): B = {return T}

  var config_OptionTempControlMixedSeL4CAmKESSetPoint: Config_OptionTempControlMixedSeL4CAmKESSetPoint = Config_OptionTempControlMixedSeL4CAmKESSetPoint(0, 20, 100, _verbose, alwaysTrue_OptionTempControlMixedSeL4CAmKESSetPoint _)
  def get_Config_OptionTempControlMixedSeL4CAmKESSetPoint: Config_OptionTempControlMixedSeL4CAmKESSetPoint = {return config_OptionTempControlMixedSeL4CAmKESSetPoint}

  def set_Config_OptionTempControlMixedSeL4CAmKESSetPoint(config: Config_OptionTempControlMixedSeL4CAmKESSetPoint): RandomLib ={
    config_OptionTempControlMixedSeL4CAmKESSetPoint = config
    return this
  }

  // ============= TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P ===================
  def alwaysTrue_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P(v: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P): B = {return T}

  var config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P = Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P(100, _verbose, alwaysTrue_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P _)

  def get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P = {return config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P}

  def set_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P(config: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P): RandomLib ={
    config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P = config
    return this
  }

  // ============= TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS ===================
  def alwaysTrue_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS(v: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS): B = {return T}

  var config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS = Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS(100, _verbose, alwaysTrue_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS _)

  def get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS = {return config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS}

  def set_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS(config: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS): RandomLib ={
    config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS = config
    return this
  }

  // ============= TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container ===================
  def alwaysTrue_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container(v: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container): B = {return T}

  var config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container = Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container _)

  def get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container = {return config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container}

  def set_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container(config: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container): RandomLib ={
    config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container = config
    return this
  }

  // ============= TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P ===================
  def alwaysTrue_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P(v: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P): B = {return T}

  var config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P = Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P(100, _verbose, alwaysTrue_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P _)

  def get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P = {return config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P}

  def set_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P(config: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P): RandomLib ={
    config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P = config
    return this
  }

  // ============= TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS ===================
  def alwaysTrue_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS(v: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS): B = {return T}

  var config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS = Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS(100, _verbose, alwaysTrue_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS _)

  def get_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS = {return config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS}

  def set_Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS(config: Config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS): RandomLib ={
    config_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS = config
    return this
  }

  // ============= TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container ===================
  def alwaysTrue_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container(v: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container): B = {return T}

  var config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container = Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container _)

  def get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container = {return config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container}

  def set_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container(config: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container): RandomLib ={
    config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container = config
    return this
  }

  // ============= TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P ===================
  def alwaysTrue_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P(v: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P): B = {return T}

  var config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P = Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P(100, _verbose, alwaysTrue_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P _)

  def get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P = {return config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P}

  def set_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P(config: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P): RandomLib ={
    config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P = config
    return this
  }

  // ============= TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS ===================
  def alwaysTrue_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS(v: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS): B = {return T}

  var config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS = Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS(100, _verbose, alwaysTrue_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS _)

  def get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS = {return config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS}

  def set_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS(config: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS): RandomLib ={
    config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS = config
    return this
  }

  // ============= TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container ===================
  def alwaysTrue_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container(v: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container): B = {return T}

  var config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container = Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container _)

  def get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container = {return config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container}

  def set_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container(config: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container): RandomLib ={
    config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container = config
    return this
  }

  // ============= TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P ===================
  def alwaysTrue_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P(v: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P): B = {return T}

  var config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P = Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P(100, _verbose, alwaysTrue_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P _)

  def get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P = {return config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P}

  def set_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P(config: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P): RandomLib ={
    config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P = config
    return this
  }

  // ============= TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS ===================
  def alwaysTrue_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS(v: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS): B = {return T}

  var config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS = Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS(100, _verbose, alwaysTrue_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS _)

  def get_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS = {return config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS}

  def set_Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS(config: Config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS): RandomLib ={
    config_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS = config
    return this
  }

  // ============= TempControlMixedSeL4CAmKES.TempUnit.Type ===================
  def alwaysTrue_TempControlMixedSeL4CAmKESTempUnitType(v: TempControlMixedSeL4CAmKES.TempUnit.Type): B = {return T}

  var config_TempControlMixedSeL4CAmKESTempUnitType: Config_TempControlMixedSeL4CAmKESTempUnitType = Config_TempControlMixedSeL4CAmKESTempUnitType(100, _verbose, alwaysTrue_TempControlMixedSeL4CAmKESTempUnitType _)

  def get_Config_TempControlMixedSeL4CAmKESTempUnitType: Config_TempControlMixedSeL4CAmKESTempUnitType = {return config_TempControlMixedSeL4CAmKESTempUnitType}

  def set_Config_TempControlMixedSeL4CAmKESTempUnitType(config: Config_TempControlMixedSeL4CAmKESTempUnitType): RandomLib ={
    config_TempControlMixedSeL4CAmKESTempUnitType = config
    return this
  }

  // ============= TempControlMixedSeL4CAmKES.TempUnit_Payload ===================
  def alwaysTrue_TempControlMixedSeL4CAmKESTempUnit_Payload(v: TempControlMixedSeL4CAmKES.TempUnit_Payload): B = {return T}

  var config_TempControlMixedSeL4CAmKESTempUnit_Payload: Config_TempControlMixedSeL4CAmKESTempUnit_Payload = Config_TempControlMixedSeL4CAmKESTempUnit_Payload(100, _verbose, alwaysTrue_TempControlMixedSeL4CAmKESTempUnit_Payload _)

  def get_Config_TempControlMixedSeL4CAmKESTempUnit_Payload: Config_TempControlMixedSeL4CAmKESTempUnit_Payload = {return config_TempControlMixedSeL4CAmKESTempUnit_Payload}

  def set_Config_TempControlMixedSeL4CAmKESTempUnit_Payload(config: Config_TempControlMixedSeL4CAmKESTempUnit_Payload): RandomLib ={
    config_TempControlMixedSeL4CAmKESTempUnit_Payload = config
    return this
  }

  // ============= TempControlMixedSeL4CAmKES.Temperature ===================
  def alwaysTrue_TempControlMixedSeL4CAmKESTemperature(v: TempControlMixedSeL4CAmKES.Temperature): B = {return T}

  var config_TempControlMixedSeL4CAmKESTemperature: Config_TempControlMixedSeL4CAmKESTemperature = Config_TempControlMixedSeL4CAmKESTemperature(100, _verbose, tc.TempControlMixedSeL4CAmKES.Temperature.D_Inv_Temperature _)

  def get_Config_TempControlMixedSeL4CAmKESTemperature: Config_TempControlMixedSeL4CAmKESTemperature = {return config_TempControlMixedSeL4CAmKESTemperature}

  def set_Config_TempControlMixedSeL4CAmKESTemperature(config: Config_TempControlMixedSeL4CAmKESTemperature): RandomLib ={
    config_TempControlMixedSeL4CAmKESTemperature = config
    return this
  }

  // ============= TempControlMixedSeL4CAmKES.Temperature_Payload ===================
  def alwaysTrue_TempControlMixedSeL4CAmKESTemperature_Payload(v: TempControlMixedSeL4CAmKES.Temperature_Payload): B = {return T}

  var config_TempControlMixedSeL4CAmKESTemperature_Payload: Config_TempControlMixedSeL4CAmKESTemperature_Payload = Config_TempControlMixedSeL4CAmKESTemperature_Payload(100, _verbose, alwaysTrue_TempControlMixedSeL4CAmKESTemperature_Payload _)

  def get_Config_TempControlMixedSeL4CAmKESTemperature_Payload: Config_TempControlMixedSeL4CAmKESTemperature_Payload = {return config_TempControlMixedSeL4CAmKESTemperature_Payload}

  def set_Config_TempControlMixedSeL4CAmKESTemperature_Payload(config: Config_TempControlMixedSeL4CAmKESTemperature_Payload): RandomLib ={
    config_TempControlMixedSeL4CAmKESTemperature_Payload = config
    return this
  }

  // ============= util.Container ===================
  def alwaysTrue_utilContainer(v: util.Container): B = {return T}

  var config_utilContainer: Config_utilContainer = Config_utilContainer(100, _verbose, F, ISZ(), alwaysTrue_utilContainer _)

  def get_Config_utilContainer: Config_utilContainer = {return config_utilContainer}

  def set_Config_utilContainer(config: Config_utilContainer): RandomLib ={
    config_utilContainer = config
    return this
  }

  // ============= util.EmptyContainer ===================
  def alwaysTrue_utilEmptyContainer(v: util.EmptyContainer): B = {return T}

  var config_utilEmptyContainer: Config_utilEmptyContainer = Config_utilEmptyContainer(100, _verbose, alwaysTrue_utilEmptyContainer _)

  def get_Config_utilEmptyContainer: Config_utilEmptyContainer = {return config_utilEmptyContainer}

  def set_Config_utilEmptyContainer(config: Config_utilEmptyContainer): RandomLib ={
    config_utilEmptyContainer = config
    return this
  }
}

