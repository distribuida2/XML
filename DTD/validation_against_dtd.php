<?php

try{
  $library = new DOMDocument();
  $library->validateOnParse = true;

  if ($library->load('/home/juancho/02.distribuida2/DTD/01.basico/quilmes.xml')) {
    if ($library->validate()) {
      echo "DTD Valido!";
    } else {
      echo "ATENCION! -> DTD NO VALIDO";
    }
  } else {
    echo "XML erroneo";
  }


} catch (Exception $e) {
  die ('DTD Validation failure.');
}



 ?>
