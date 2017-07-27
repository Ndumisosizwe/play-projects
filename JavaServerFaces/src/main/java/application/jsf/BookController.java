package application.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean ( name = "bookController" )
public class BookController {

  private String isbn;

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn( String isbn ) {
    this.isbn = isbn;
  }
}
