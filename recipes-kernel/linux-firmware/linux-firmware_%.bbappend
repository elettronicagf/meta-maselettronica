# Copyright 2017-2022,2024 NXP

# Camera MIPI-CSI AP1302+AR0144 NXP EVK
# Renamed firmware ap1302_60fps_ar0144_27M_2Lane_awb_tuning.bin to ap1302.fw


FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
SRC_URI += "file://ap1302.fw"


do_install:append () {
	install -d ${D}${base_libdir}/firmware/imx/camera
	install -m 0755 ${WORKDIR}/ap1302.fw ${D}${nonarch_base_libdir}/firmware/imx/camera/
}

# NOTE: Use "=+" instead of "+=". Otherwise, the file is placed into the linux-firmware package.
PACKAGES =+ "${PN}-camera"
FILES:${PN}-camera = "${nonarch_base_libdir}/firmware/imx/camera/ap1302.fw"
