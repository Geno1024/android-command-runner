#!/usr/bin/env bash
adb shell ls /system/bin > ./internal.txt
adb shell busybox | xargs | sed "s/ //g" | sed "s/,/\n/g" > ./busybox.txt