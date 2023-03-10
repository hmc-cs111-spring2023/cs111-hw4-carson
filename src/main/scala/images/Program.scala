@main
def image_program() = {
  val imageFilePath = "src/resources/image.png"
  val outputFilePath = "output.png"


  // Instead of the code above, we want to use function composition to write the following:
  // save(
  //   rotateRight(
  //     grayscale(
  //       flipHorizontal(
  //         load(imageFilePath)
  //       )
  //     )
  //   ),
  //   outputFilePath
  // )
  
  save(rotateRight(grayscale(flipHorizontal(load(imageFilePath)))),outputFilePath)

}
