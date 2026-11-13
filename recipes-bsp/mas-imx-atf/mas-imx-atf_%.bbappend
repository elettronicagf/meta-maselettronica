FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRCBRANCH:egfgithub = "iMX9-OSM-scarthgap"
SRC_URI:egfgithub = "git://github.com/elettronicagf/imx-atf-egf;protocol=https;branch=${SRCBRANCH}"
SRCREV:egfgithub = "1b27ee3edbb40ef9432c69ccaa744d1ac5d54c5d"
