// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReversePersonController PersonController = new controllers.ReversePersonController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCalzadaController CalzadaController = new controllers.ReverseCalzadaController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSegmentoController SegmentoController = new controllers.ReverseSegmentoController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseBordilloController BordilloController = new controllers.ReverseBordilloController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReversePersonController PersonController = new controllers.javascript.ReversePersonController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCalzadaController CalzadaController = new controllers.javascript.ReverseCalzadaController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSegmentoController SegmentoController = new controllers.javascript.ReverseSegmentoController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseBordilloController BordilloController = new controllers.javascript.ReverseBordilloController(RoutesPrefix.byNamePrefix());
  }

}
