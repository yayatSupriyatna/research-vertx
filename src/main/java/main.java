import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;

import static io.vertx.core.Vertx.*;

public class main {
    public static void main(String[] args) {
        HttpServer server = vertx().createHttpServer();
        server.requestHandler(request -> {
            HttpServerResponse response = request.response();
            response.putHeader("content-type", "text/plain");
            response.end("Hello World");
        });
        server.listen(8080);

    }
}
