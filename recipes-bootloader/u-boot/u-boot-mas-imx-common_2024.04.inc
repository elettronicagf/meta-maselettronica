DESCRIPTION = "i.MX U-Boot suppporting i.MX reference boards."

LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

UBOOTSRCBRANCH = "${UBOOT_SRCBRANCH}"
SRC_URI = "${BASE_URL}/repo-shared/bsp/bootloader/uboot-imx.git;${BASE_PROTOCOL};branch=${UBOOTSRCBRANCH}"
SRC_URI:egfgithub = "git://github.com/elettronicagf/uboot-imx-egf;protocol=https;branch=${UBOOTSRCBRANCH}"

LOCALVERSION ?= "-${UBOOTSRCBRANCH}"
SRCREV = "${UBOOT_SRCREV}"

DEPENDS += " \
    bc-native \
    bison-native \
    dtc-native \
    flex-native \
    gnutls-native \
    xxd-native \
"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"

inherit fsl-u-boot-localversion

BOOT_TOOLS = "imx-boot-tools"
