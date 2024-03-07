package mx.uv;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        options("/*", (request, response) -> {
            String accessControlRequestHeaders = request.headers("Access-Control-Request-Headers");
            if (accessControlRequestHeaders != null) {
                response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);
            }
            String accessControlRequestMethod = request.headers("Access-Control-Request-Method");
            if (accessControlRequestMethod != null) {
                response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
            }
            return "OK";
        });
        before((request, response) -> response.header("Access-Control-Allow-Origin", "*"));

        get("/", (request, response) -> "<h1>Bienvenidx</h1>");

        get("/xml", (request, response) -> {
            String respuesta = "<p><x><y>algo</y> <y>algo2</y></x></p>";
            response.type("application/xml");
            return respuesta;
        });
    }
}

=======
package mx.uv;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        get("/xml", (request, response) -> {
            String respuesta = "<x><y/></x>";
            response.type("application/xml");
            return respuesta;
        });
    }
}>>>>>>>40 ccde10a509a83d57e197b32d9dbbefaa463808
