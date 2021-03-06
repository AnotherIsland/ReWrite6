<%-- 
    Document   : Resumen
    Created on : 17/11/2018, 07:02:00 AM
    Author     : Axolotech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <link type="text/css" rel="stylesheet" href="../../css/materialize.css"  media="screen,projection"/>
  <link rel="shortcut icon" type="image/x-icon" href="../../favicon.ico"/>


  <link rel="stylesheet" type="text/css" href="../../css/style.css">
  <!--<script type="text/javascript" src="../../js/main.js"></script>-->

  <title>ReWrite - Resumen</title>
</head>
<body >
<div class="" name="header">
  <nav>
    <div class="nav-wrapper ">
      <a href="../../index.jsp" class="brand-logo"><img class="responsive-img center-align" style="padding: 10px" src="../../img/logoT.png"></a>
      <a href="#" data-target="mobile-demo" class="sidenav-trigger"><i class="material-icons">menu</i></a>
      <ul class="right hide-on-med-and-down">
        <li><a class=" text-accent-4" href="../Login.jsp">Cerrar Sesión</a></li>
        <li><a class=" text-accent-4" href="../MISOBRAS/MisObras.jsp">Mis Obras</a></li>
        <li><a class=" text-accent-4" href="../CREAR/Crear.jsp">Crear</a></li>
        <li><a class=" text-accent-4" href="../AJUSTES/Ajustes.jsp">Ajustes</a></li>
        <li><a class=" text-accent-4" href="../EVOLUCION/Evolucion.jsp">Evolución</a></li>
      </ul>
      <ul class="sidenav" id="mobile-demo">
        <li><a class=" text-accent-4" href="../Login.jsp">Cerrar Sesión</a></li>
        <li><a class=" text-accent-4" href="../MISOBRAS/MisObras.jsp">Mis Obras</a></li>
        <li><a class=" text-accent-4" href="../CREAR/Crear.jsp">Crear</a></li>
        <li><a class=" text-accent-4" href="../AJUSTES/Ajustes.jsp">Ajustes</a></li>
        <li><a class=" text-accent-4" href="../EVOLUCION/Evolucion.jsp">Evolución</a></li>
      </ul>
    </div>
  </nav>
</div>
<div class="container">

  <div class="row">

    <div class="section grey col s3 m3 l3 xl3"><!--Sidebar para consejos y revisiones-->
      <h2 class="white-text">Resumen</h2>
      <div class="row">
        <br><a href="#" data-target="slide-out" class="sidenav-trigger"><i class="material-icons">forum</i>&nbsp;Ver el chat</a>
        <h6 class="white-text">Aquí tenemos unos muy buenos consejos para ti. </h6><br>
        <ul class="collapsible">
          <li>
            <div class="collapsible-header"><i class="material-icons">assignment_turned_in</i>Ortografía y gramática</div>
            <div class="collapsible-body">
              <span class="white-text">consejo</span><!--aquí va el consejo-->
            </div>
          </li>
          <li>
            <div class="collapsible-header"><i class="material-icons">photo_filter</i>Claridad</div>
            <div class="collapsible-body">
              <span class="white-text">consejo</span><!--aquí va el consejo-->
            </div>
          </li>
          <li>
            <div class="collapsible-header"><i class="material-icons">description</i>Palabras clave</div>
            <div class="collapsible-body" name="pClave" id="pClave"><!--aquí va el consejo-->
              <ul id="listaClaves">
                <li class="white-text">
                  <input type="text" onkeypress="validap();" placeholder="Añade una palabra" onblur="agregaPalabra(this);">
                </li>
              </ul>
            </div>
          </li>
        </ul>
        <h6 class="white-text">Palabras:</h6><br><!--Aquí va el conteo de número de palabras-->
      </div>
      <div class="row">
        <h6 class="white-text">Otras herramientas</h6><br>

        <button id="nuevaRef" class="btn-floating btn-large waves-effect waves-light blue" onclick="mostrarTipoRef();">
          <i class="material-icons">add</i>
        </button><label class="white-text" for="nuevaRef">&nbsp;&nbsp;Nueva referencia</label>
        <div class="input-field col s12 m12 l12 xl12" id="tipoRef" name="tipoRef" hidden ><!--aparece sólo cuando se da clic en nueva referencia-->
          <form>
            <select id="tipoReferencia" name="tipoReferencia" onchange="newRef(this);">
              <option class="white-text" value="" disabled selected>Elige uno..</option>
              <option value="1">Bibliográfica</option>
              <option value="2">Artículo Web</option>
            </select>
          </form>
        </div>
        <br><br>
        <!--Compartir obra y despliega vínculo-->
        <button id="compartir" class="btn-floating btn-large waves-effect waves-light blue" onclick="mostrarCompartir();">
          <i class="material-icons">person_add</i>
        </button><label class="white-text" for="compartir">&nbsp;&nbsp;Compartir Obra</label>
        <div class="" style="overflow: hidden;" id="share" name="share" hidden ><!--aparece sólo cuando se da clic en compartir-->
          <a class="truncate" href="https://material.io/tools/color/?fbclid=IwAR0W6Dplr3J4E2x6bGo_lqiLd-kJJJijRuk5t9iEXBO4FblTc51Y9mNjaoY#!/?view.left=1&view.right=0&primary.color=212121&secondary.color=64B5F6">https://material.io/tools/color/?fbclid=IwAR0W6Dplr3J4E2x6bGo_lqiLd-kJJJijRuk5t9iEXBO4FblTc51Y9mNjaoY#!/?view.left=1&view.right=0&primary.color=212121&secondary.color=64B5F6
          </a>
        </div>
      </div>
    </div>

    <div class="section lienzo white col s8 m8 l8 xl8"><!--contenido principal donde se escribe-->
        <form name="form1" id="form1">
          <input type="submit" class="btn waves-effect waves-light right" name="guardar" id="guardar" value="Guardar"><br><br>
          <input type="text" class="input-field oculto " placeholder="Título" name="titulo" id="titulo" >
          <label for="contenido"><h6>Contenido</h6></label>
          <input class="input-field oculto" id="contenido" name="contenido">
          </input>
          <label for="referencias"><h6>Referencias</h6></label><br>
          <div type="text" id="referencias" name="referencias" class="input-field oculto">
            <!--Aquí se generan las referencias-->
          </div>
        </form>
    </div>

    <ul id="slide-out" class="sidenav">
      <div class="chat section">
        <div class="row">
          <div id="messages"></div>
        </div>
        <div class="row">
          <div id="users" >
            <h7>Usuarios conectados: </h7>
            <ul id="user-list" class="list-group"></ul>
          </div>
        </div>

        <div class="responsive-table">
          <table class="table" align="centered">
            <tr>
              <form class="col l12 m12 s12 xl12" name="messageToSend">
                </th>
                <th>
                  <div class="input-field">
                    <label for="text">Mensaje:</label>
                    <textarea class="materialize-textarea" id="text" placeholder="Escribe aquí..."></textarea>
                  </div>
                  <div class="alert alert-danger" id="alert2"><strong>ERROR! </strong>Ingresa un mensaje válido.</div>
                </th>
                <th><br><br>
                  <div class="">
                    <button class="btn-floating btn-large waves-effect waves-light blue" onclick="addMessage()">
                      <i class="material-icons medium">send</i>
                    </button>
                  </div>
                </th>
              </form>
            </tr>
          </table>
        </div>
      </div>
    </ul>
  </div>

</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript" src="../../js/materialize.min.js"></script>
<script type="text/javascript" src="../../js/init.js"></script>
</body>
</html>
