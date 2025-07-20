public class BillData {

  public URL link;
  public String quip;
  public Image image;
  public int image_pixels[];

  public BillData(URL link, String quip, Image image) {
    this.link = link;
    this.quip = quip;
    this.image = image;
  }

  public void initPixels(int image_width, int image_height) {

    image_pixels = new int[image_width * image_height];

    //# Create a PixelGrabber to Get the Pixels of the image and store
    //# them into the image_pixels array
    PixelGrabber pixel_grabber = new PixelGrabber(image.getSource(), 0, 0,
              image_width, image_height, image_pixels, 0, image_width);

    try {
      pixel_grabber.grabPixels();
    } catch (InterruptedException e) {
      //# I assume if there was an interrupt, the applet has been aborted
      //# and doesn't need the pixels anymore anyways.
      return;
    }
  }
}