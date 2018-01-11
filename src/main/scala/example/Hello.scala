package example

import shapeless.tag
import shapeless.tag.@@

object Hello extends App {

  trait UserNameTag
  trait PasswordTag
  trait AddressTag

  type UserName = String @@ UserNameTag
  type Password = String @@ PasswordTag
  type Address = String @@ AddressTag

  case class User(name: UserName, password: Password, address: Address)

  val name = tag[UserNameTag][String]("Freewind")
  val password = tag[PasswordTag][String]("123456")
  val address = tag[AddressTag][String]("China")

  val user = User(name, password, address)

  println(name.getClass)
  println(user)

}
