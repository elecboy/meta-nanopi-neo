#!/bin/sh
GPIO=/usr/bin/gpio
PIN_WIFI_EN=14

$GPIO export $PIN_WIFI_EN out
$GPIO mode $PIN_WIFI_EN out

if [ -n "$1" ] ;then
    if [ "$1" == "on" ] ;then
        $GPIO write $PIN_WIFI_EN 1
    elif [ "$1" == "off" ] ;then
        $GPIO write $PIN_WIFI_EN 0
    else
        /bin/echo "parm error:$1"
    fi
else
    /bin/echo "parm num error"
fi

