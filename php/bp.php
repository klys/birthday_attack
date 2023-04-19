<?php
$hashSet = array();

while (true) {
    $input = strval(rand());
    $hash = sha1($input);
  
    if (array_key_exists($hash, $hashSet)) {
        echo "Collision found for inputs $input and " . $hashSet[$hash] . "\n";
        break;
    }
  
    $hashSet[$hash] = $input;
}
?>