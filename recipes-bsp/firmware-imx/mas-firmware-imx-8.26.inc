# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2024 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ca53281cc0caa7e320d4945a896fb837" 

# Note: This .inc file is used from differently named recipes, so the package
# name must be hard-coded, i.e., ${BPN} cannot be used.
FIRMWARE_IMX_SRCBRANCH = "iMX9-OSM-scarthgap"

SRC_URI = "git:///home/repo-shared/bsp/bootloader/firmware-imx.git;protocol=file;branch=${FIRMWARE_IMX_SRCBRANCH}"
SRC_URI:egf-remote = "git://git@git.maselettronica.com:22222/maselettronica/yocto/products/sbc/bsp/bootloader/firmware-imx.git;protocol=ssh;branch=${FIRMWARE_IMX_SRCBRANCH}"

SRCREV = "45c00a3854daf86d06523892b9d15924ad1aa4fa"

S = "${WORKDIR}/git/firmware-imx-${PV}"
