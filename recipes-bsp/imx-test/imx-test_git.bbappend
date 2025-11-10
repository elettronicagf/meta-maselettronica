# Copyright (C) 2012-2016 O.S. Systems Software LTDA.
# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP

FILESEXTRAPATHS:prepend := "${THISDIR}/imx-test:"

DEPENDS:append:mx8ulp-nxp-bsp = " imx-lib"
DEPENDS:append:mx93-nxp-bsp = " imx-lib"

SRC_URI = "file://memtool_profile"

PLATFORM:mx8ulp-nxp-bsp = "IMX8ULP"
PLATFORM:mx91-nxp-bsp = "IMX8"
PLATFORM:mx93-nxp-bsp = "IMX8ULP"
PLATFORM:mx95-nxp-bsp = "IMX8"

addtask custom after do_install
do_custom () {
	cat ${S}/profile >> ${D}/root/.profile
}
