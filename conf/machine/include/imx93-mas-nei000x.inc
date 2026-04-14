require conf/machine/include/imx-mas-base.inc
require conf/machine/include/arm/armv8-2a/tune-cortexa55.inc

#IMX_DEFAULT_BOOTLOADER:use-nxp-bsp = "u-boot-imx"
#IMX_DEFAULT_BOOTLOADER:use-mainline-bsp = "u-boot-fslc"

LOADADDR = ""
UBOOT_SUFFIX = "bin"
UBOOT_MAKE_TARGET = ""

SPL_BINARY = "spl/u-boot-spl.bin"

# Set ATF platform name
ATF_PLATFORM = "imx93"

IMXBOOT_TARGETS = "flash_singleboot"

IMX_BOOT_SOC_TARGET = "iMX9"
IMX_BOOT_SEEK = "32"

# We have to disable SERIAL_CONSOLE due to auto-serial-console
SERIAL_CONSOLES = "115200;ttyLP0"

IMX_DEFAULT_BSP = "nxp"

MACHINE_FEATURES = "usbgadget usbhost vfat touchscreen"
MACHINE_FEATURES:append:use-nxp-bsp = " optee jailhouse"
MACHINE_FEATURES:remove:ailux = " bluetooth optee jailhouse touchscreen wifi"
