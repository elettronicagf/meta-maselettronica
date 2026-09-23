# Copyright 2017-2023 NXP
 
DEPENDS = "zlib-native openssl-native"

SRCBRANCH = "${MASMKIMAGE_SRCBRANCH}"
SRCREV = "${MASMKIMAGE_SRCREV}"

SRC_URI = "${BASE_URL}/repo-shared/bsp/bootloader/imx-mkimage.git;${BASE_PROTOCOL};branch=${SRCBRANCH} \
           file://0001-iMX8M-soc.mak-use-native-mkimage-from-sysroot.patch \
"

S = "${WORKDIR}/git"

BOOT_TOOLS = "mas-boot-tools"
SYSROOT_DIRS += "/boot"
