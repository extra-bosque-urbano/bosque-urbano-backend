package mx.org.extra.bosqueurbano;

import static spark.Spark.*;

/**
 * Created by ignacio on 7/21/15.
 */
public class App {

  public static void main(String[] args) {
    get("/hello", (req, res) -> "Hello World");
  }
}
