package doodle.examples

import doodle.core._
import doodle.image.Image

object ChessBoard {
  val blackSquare = Image.rectangle(30, 30) fillColor Color.black
  val redSquare = Image.rectangle(30, 30) fillColor Color.red

  val twoByTwo =
    (redSquare beside blackSquare) above
      (blackSquare beside redSquare)

  val fourByFour =
    (twoByTwo beside twoByTwo) above
      (twoByTwo beside twoByTwo)

  val image =
    (fourByFour beside fourByFour) above
      (fourByFour beside fourByFour)
}
