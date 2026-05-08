class Language {

  private static Language language;

  private Language() {
    System.out.println("Inside Private Constructor");
  }

  public static Language getInstance() {

     
     if(language == null) {
        language = new Language();
     }
      return language;
  }
  public void display() {
      System.out.println("Singleton Pattern is achieved");
  }
}

