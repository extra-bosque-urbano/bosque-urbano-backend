package mx.org.extra.bosqueurbano;

import static spark.Spark.*;

/**
 * Created by ignacio on 7/21/15.
 */
public class App {

  public static void main(String[] args) {
    get("/", (req, res) -> "Home");

    post("/trees/:id/reports", (req, res) -> "Reports of a tree");

    get("/species/:id", (req, res) -> "Info of a specie");

    get("/trees/:id", (req, res) -> "Info of a tree");

    post("/treekeepers", (req, res) -> "Tree keepers of a tree");

    get("/trees", (req, res) -> "All my trees");
  }
}
