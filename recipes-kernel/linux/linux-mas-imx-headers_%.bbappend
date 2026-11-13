FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

KERNELSRCBRANCH:egfgithub = "${KERNEL_SRCBRANCH}"
LOCALVERSION:egfgithub = "-${KERNELSRCBRANCH}"
SRCREV:egfgithub = "${KERNEL_SRCREV}"
SRC_URI:egfgithub = "git://github.com/elettronicagf/linux-imx-egf;protocol=https;branch=${KERNELSRCBRANCH}"
