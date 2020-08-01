// Copyright (c) 2019 PSForever
import net.psforever.packet.game.objectcreate.{Cosmetics, PersonalStyle}
import org.specs2.mutable._

class CosmeticsTest extends Specification {
  "Cosmetics" should {
    "construct" in {
      Cosmetics()
      Cosmetics(3)
      Cosmetics(PersonalStyle.Helmet)
      Cosmetics(Set(PersonalStyle.Helmet))
      Cosmetics(true, false, false, false, false)
      ok
    }

    "translate into a numeric value" in {
      Cosmetics().value mustEqual 0
      Cosmetics(3).value mustEqual 3
      Cosmetics(PersonalStyle.Helmet).value mustEqual PersonalStyle.Helmet.id
      Cosmetics(
        Set(PersonalStyle.Helmet, PersonalStyle.Earpiece)
      ).value mustEqual PersonalStyle.Helmet.id + PersonalStyle.Earpiece.id
      Cosmetics(true, false, false, false, false).value mustEqual PersonalStyle.Helmet.id
    }

    "translate into a list of cosmetic style tokens" in {
      Cosmetics().Styles mustEqual Set()
      Cosmetics(3).Styles mustEqual Set(PersonalStyle.BrimmedCap, PersonalStyle.Earpiece)
      Cosmetics(PersonalStyle.Helmet).Styles mustEqual Set(PersonalStyle.Helmet)
      Cosmetics(Set(PersonalStyle.Helmet)).Styles mustEqual Set(PersonalStyle.Helmet)
      Cosmetics(true, false, false, false, false).Styles mustEqual Set(PersonalStyle.Helmet)
    }

    "report containing specific values only" in {
      val cos = Cosmetics(Set(PersonalStyle.Helmet, PersonalStyle.Earpiece))
      cos.contains(PersonalStyle.Helmet) mustEqual true
      cos.contains(PersonalStyle.Beret) mustEqual false
    }

    "add values" in {
      val cos = Cosmetics()
      cos.Styles mustEqual Set()
      val cos1 = cos + PersonalStyle.Helmet
      cos1.Styles mustEqual Set(PersonalStyle.Helmet)
      cos1.Styles mustNotEqual cos.Styles
      val cos2 = cos1 + PersonalStyle.Beret
      cos2.Styles mustEqual Set(PersonalStyle.Helmet, PersonalStyle.Beret)
      cos2.Styles mustNotEqual cos.Styles
      cos2.Styles mustNotEqual cos1.Styles
    }

    "can not add already included values" in {
      val cos = Cosmetics(Set(PersonalStyle.Helmet, PersonalStyle.Beret))
      cos.Styles mustEqual Set(PersonalStyle.Helmet, PersonalStyle.Beret)
      val cos1 = cos + PersonalStyle.Beret
      cos1.Styles mustEqual Set(PersonalStyle.Helmet, PersonalStyle.Beret)
      cos ne cos1 mustEqual true
    }

    "remove values" in {
      val cos = Cosmetics(Set(PersonalStyle.Helmet, PersonalStyle.Beret))
      cos.Styles mustEqual Set(PersonalStyle.Helmet, PersonalStyle.Beret)
      val cos1 = cos - PersonalStyle.Helmet
      cos1.Styles mustEqual Set(PersonalStyle.Beret)
      cos1.Styles mustNotEqual cos.Styles
      val cos2 = cos1 - PersonalStyle.Beret
      cos2.Styles mustEqual Set()
      cos2.Styles mustNotEqual cos.Styles
      cos2.Styles mustNotEqual cos1.Styles
    }

    "can not remove un-included or already excluded values" in {
      val cos = Cosmetics(Set(PersonalStyle.Helmet, PersonalStyle.Beret))
      cos.Styles mustEqual Set(PersonalStyle.Helmet, PersonalStyle.Beret)
      val cos1 = cos - PersonalStyle.Beret
      cos1.Styles mustEqual Set(PersonalStyle.Helmet)

      val cos2 = cos - PersonalStyle.Beret //again
      cos2.Styles mustEqual Set(PersonalStyle.Helmet)

      val cos3 = cos1 - PersonalStyle.Earpiece
      cos3.Styles mustEqual Set(PersonalStyle.Helmet)
    }
  }
}
