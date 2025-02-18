# Copyright 2017-2023 NXP
 
DEPENDS = "zlib-native openssl-native"

MAS_MKIMAGE_SRC = "git://git@git.maselettronica.com:22222/maselettronica/yocto/products/sbc/bsp/bootloader/imx-mkimage.git;protocol=ssh"
SRCBRANCH = "${MASMKIMAGE_SRCBRANCH}"
SRCREV = "${MASMKIMAGE_SRCREV}"

SRC_URI = "${MAS_MKIMAGE_SRC};branch=${SRCBRANCH} \
           file://0001-iMX8M-soc.mak-use-native-mkimage-from-sysroot.patch \
"

S = "${WORKDIR}/git"

BOOT_TOOLS = "mas-boot-tools"
SYSROOT_DIRS += "/boot"
