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

@record class Gen_String(param: RandomLibI) extends MJen[String] {
  override def generate(f: String => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextString())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Z(param: RandomLibI) extends MJen[Z] {
  override def generate(f: Z => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextZ())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_B(param: RandomLibI) extends MJen[B] {
  override def generate(f: B => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextB())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_C(param: RandomLibI) extends MJen[C] {
  override def generate(f: C => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextC())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_R(param: RandomLibI) extends MJen[R] {
  override def generate(f: R => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextR())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_F32(param: RandomLibI) extends MJen[F32] {
  override def generate(f: F32 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextF32())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_F64(param: RandomLibI) extends MJen[F64] {
  override def generate(f: F64 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextF64())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_S8(param: RandomLibI) extends MJen[S8] {
  override def generate(f: S8 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextS8())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_S16(param: RandomLibI) extends MJen[S16] {
  override def generate(f: S16 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextS16())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_S32(param: RandomLibI) extends MJen[S32] {
  override def generate(f: S32 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextS32())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_S64(param: RandomLibI) extends MJen[S64] {
  override def generate(f: S64 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextS64())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_U8(param: RandomLibI) extends MJen[U8] {
  override def generate(f: U8 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextU8())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_U16(param: RandomLibI) extends MJen[U16] {
  override def generate(f: U16 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextU16())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_U32(param: RandomLibI) extends MJen[U32] {
  override def generate(f: U32 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextU32())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_U64(param: RandomLibI) extends MJen[U64] {
  override def generate(f: U64 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextU64())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}


@record class Gen__artDataContent(param: RandomLibI) extends MJen[art.DataContent] {
  override def generate(f: art.DataContent => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.next_artDataContent())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen__artEmpty(param: RandomLibI) extends MJen[art.Empty] {
  override def generate(f: art.Empty => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.next_artEmpty())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesBoolean_Payload(param: RandomLibI) extends MJen[Base_Types.Boolean_Payload] {
  override def generate(f: Base_Types.Boolean_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesBoolean_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesInteger_Payload(param: RandomLibI) extends MJen[Base_Types.Integer_Payload] {
  override def generate(f: Base_Types.Integer_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesInteger_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesInteger_8_Payload(param: RandomLibI) extends MJen[Base_Types.Integer_8_Payload] {
  override def generate(f: Base_Types.Integer_8_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesInteger_8_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesInteger_16_Payload(param: RandomLibI) extends MJen[Base_Types.Integer_16_Payload] {
  override def generate(f: Base_Types.Integer_16_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesInteger_16_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesInteger_32_Payload(param: RandomLibI) extends MJen[Base_Types.Integer_32_Payload] {
  override def generate(f: Base_Types.Integer_32_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesInteger_32_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesInteger_64_Payload(param: RandomLibI) extends MJen[Base_Types.Integer_64_Payload] {
  override def generate(f: Base_Types.Integer_64_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesInteger_64_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesUnsigned_8_Payload(param: RandomLibI) extends MJen[Base_Types.Unsigned_8_Payload] {
  override def generate(f: Base_Types.Unsigned_8_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesUnsigned_8_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesUnsigned_16_Payload(param: RandomLibI) extends MJen[Base_Types.Unsigned_16_Payload] {
  override def generate(f: Base_Types.Unsigned_16_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesUnsigned_16_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesUnsigned_32_Payload(param: RandomLibI) extends MJen[Base_Types.Unsigned_32_Payload] {
  override def generate(f: Base_Types.Unsigned_32_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesUnsigned_32_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesUnsigned_64_Payload(param: RandomLibI) extends MJen[Base_Types.Unsigned_64_Payload] {
  override def generate(f: Base_Types.Unsigned_64_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesUnsigned_64_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesFloat_Payload(param: RandomLibI) extends MJen[Base_Types.Float_Payload] {
  override def generate(f: Base_Types.Float_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesFloat_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesFloat_32_Payload(param: RandomLibI) extends MJen[Base_Types.Float_32_Payload] {
  override def generate(f: Base_Types.Float_32_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesFloat_32_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesFloat_64_Payload(param: RandomLibI) extends MJen[Base_Types.Float_64_Payload] {
  override def generate(f: Base_Types.Float_64_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesFloat_64_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesCharacter_Payload(param: RandomLibI) extends MJen[Base_Types.Character_Payload] {
  override def generate(f: Base_Types.Character_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesCharacter_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesString_Payload(param: RandomLibI) extends MJen[Base_Types.String_Payload] {
  override def generate(f: Base_Types.String_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesString_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_ISZB(param: RandomLibI) extends MJen[ISZ[B]] {
  override def generate(f: ISZ[B] => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextISZB())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesBits_Payload(param: RandomLibI) extends MJen[Base_Types.Bits_Payload] {
  override def generate(f: Base_Types.Bits_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesBits_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_TempControlMixedSeL4CAmKESFanAckType(param: RandomLibI) extends MJen[TempControlMixedSeL4CAmKES.FanAck.Type] {
  override def generate(f: TempControlMixedSeL4CAmKES.FanAck.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextTempControlMixedSeL4CAmKESFanAckType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_TempControlMixedSeL4CAmKESFanAck_Payload(param: RandomLibI) extends MJen[TempControlMixedSeL4CAmKES.FanAck_Payload] {
  override def generate(f: TempControlMixedSeL4CAmKES.FanAck_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextTempControlMixedSeL4CAmKESFanAck_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_TempControlMixedSeL4CAmKESFanCmdType(param: RandomLibI) extends MJen[TempControlMixedSeL4CAmKES.FanCmd.Type] {
  override def generate(f: TempControlMixedSeL4CAmKES.FanCmd.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextTempControlMixedSeL4CAmKESFanCmdType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_TempControlMixedSeL4CAmKESFanCmd_Payload(param: RandomLibI) extends MJen[TempControlMixedSeL4CAmKES.FanCmd_Payload] {
  override def generate(f: TempControlMixedSeL4CAmKES.FanCmd_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextTempControlMixedSeL4CAmKESFanCmd_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container(param: RandomLibI) extends MJen[TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container] {
  override def generate(f: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_OptionTempControlMixedSeL4CAmKESFanCmdType(param: RandomLibI) extends MJen[Option[TempControlMixedSeL4CAmKES.FanCmd.Type]] {
  override def generate(f: Option[TempControlMixedSeL4CAmKES.FanCmd.Type] => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOptionTempControlMixedSeL4CAmKESFanCmdType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P(param: RandomLibI) extends MJen[TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P] {
  override def generate(f: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS(param: RandomLibI) extends MJen[TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS] {
  override def generate(f: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container(param: RandomLibI) extends MJen[TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container] {
  override def generate(f: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_OptionTempControlMixedSeL4CAmKESFanAckType(param: RandomLibI) extends MJen[Option[TempControlMixedSeL4CAmKES.FanAck.Type]] {
  override def generate(f: Option[TempControlMixedSeL4CAmKES.FanAck.Type] => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOptionTempControlMixedSeL4CAmKESFanAckType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P(param: RandomLibI) extends MJen[TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P] {
  override def generate(f: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS(param: RandomLibI) extends MJen[TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS] {
  override def generate(f: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_TempControlMixedSeL4CAmKESSetPoint(param: RandomLibI) extends MJen[TempControlMixedSeL4CAmKES.SetPoint] {
  override def generate(f: TempControlMixedSeL4CAmKES.SetPoint => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextTempControlMixedSeL4CAmKESSetPoint())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_TempControlMixedSeL4CAmKESSetPoint_Payload(param: RandomLibI) extends MJen[TempControlMixedSeL4CAmKES.SetPoint_Payload] {
  override def generate(f: TempControlMixedSeL4CAmKES.SetPoint_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextTempControlMixedSeL4CAmKESSetPoint_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container(param: RandomLibI) extends MJen[TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container] {
  override def generate(f: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Option_artEmpty(param: RandomLibI) extends MJen[Option[art.Empty]] {
  override def generate(f: Option[art.Empty] => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOption_artEmpty())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_OptionTempControlMixedSeL4CAmKESSetPoint(param: RandomLibI) extends MJen[Option[TempControlMixedSeL4CAmKES.SetPoint]] {
  override def generate(f: Option[TempControlMixedSeL4CAmKES.SetPoint] => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOptionTempControlMixedSeL4CAmKESSetPoint())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P(param: RandomLibI) extends MJen[TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P] {
  override def generate(f: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS(param: RandomLibI) extends MJen[TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS] {
  override def generate(f: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container(param: RandomLibI) extends MJen[TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container] {
  override def generate(f: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P(param: RandomLibI) extends MJen[TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P] {
  override def generate(f: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS(param: RandomLibI) extends MJen[TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS] {
  override def generate(f: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container(param: RandomLibI) extends MJen[TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container] {
  override def generate(f: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P(param: RandomLibI) extends MJen[TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P] {
  override def generate(f: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS(param: RandomLibI) extends MJen[TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS] {
  override def generate(f: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container(param: RandomLibI) extends MJen[TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container] {
  override def generate(f: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P(param: RandomLibI) extends MJen[TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P] {
  override def generate(f: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS(param: RandomLibI) extends MJen[TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS] {
  override def generate(f: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_TempControlMixedSeL4CAmKESTempUnitType(param: RandomLibI) extends MJen[TempControlMixedSeL4CAmKES.TempUnit.Type] {
  override def generate(f: TempControlMixedSeL4CAmKES.TempUnit.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextTempControlMixedSeL4CAmKESTempUnitType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_TempControlMixedSeL4CAmKESTempUnit_Payload(param: RandomLibI) extends MJen[TempControlMixedSeL4CAmKES.TempUnit_Payload] {
  override def generate(f: TempControlMixedSeL4CAmKES.TempUnit_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextTempControlMixedSeL4CAmKESTempUnit_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_TempControlMixedSeL4CAmKESTemperature(param: RandomLibI) extends MJen[TempControlMixedSeL4CAmKES.Temperature] {
  override def generate(f: TempControlMixedSeL4CAmKES.Temperature => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextTempControlMixedSeL4CAmKESTemperature())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_TempControlMixedSeL4CAmKESTemperature_Payload(param: RandomLibI) extends MJen[TempControlMixedSeL4CAmKES.Temperature_Payload] {
  override def generate(f: TempControlMixedSeL4CAmKES.Temperature_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextTempControlMixedSeL4CAmKESTemperature_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_utilContainer(param: RandomLibI) extends MJen[util.Container] {
  override def generate(f: util.Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextutilContainer())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_utilEmptyContainer(param: RandomLibI) extends MJen[util.EmptyContainer] {
  override def generate(f: util.EmptyContainer => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextutilEmptyContainer())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}


