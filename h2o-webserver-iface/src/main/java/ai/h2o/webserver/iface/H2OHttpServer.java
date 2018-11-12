package ai.h2o.webserver.iface;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

public interface H2OHttpServer {
  void acceptRequests();

  String getScheme();

  boolean authenticationHandler(HttpServletRequest request, HttpServletResponse response) throws IOException;

  void gateHandler(HttpServletRequest request, HttpServletResponse response);

  boolean loginHandler(String target, HttpServletRequest request, HttpServletResponse response) throws IOException;

  WebServerConfig getConfig();

  Collection<RequestAuthExtension> getAuthExtensions();

  boolean proxyLoginHandler(String target, HttpServletRequest request, HttpServletResponse response) throws IOException;
}
