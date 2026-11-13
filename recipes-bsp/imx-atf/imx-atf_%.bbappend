FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRCBRANCH = "iMX9-OSM-scarthgap"
SRCREV = "1b27ee3edbb40ef9432c69ccaa744d1ac5d54c5d"
SRC_URI = "${BASE_URL}/repo-shared/bsp/bootloader/imx-atf.git;${BASE_PROTOCOL};branch=${SRCBRANCH}"
SRC_URI:egfgithub = "git://github.com/elettronicagf/imx-atf-egf;protocol=https;branch=${SRCBRANCH}"

