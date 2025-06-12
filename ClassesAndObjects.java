
class Nokia {

  private int mic;
  private int cam;

  void Set() {
    mic = 2;
    cam = 40;
  }

  void Show() {
    System.out.println("Mic: " + mic);
    System.out.println("Cam: " + cam);
  }

}

class ClassesAndObjects {

  public static void main(String[] args) {
    Nokia n = new Nokia();
    n.Show();
    n.Set();
    n.Show();
  }

}
