# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "This is the main core image for MAS NEITH000X systems"

require recipes-core/images/mas-imx93-core-image-minimal.bb

TOOLCHAIN_HOST_TASK:append = " lvgl"

IMAGE_FEATURES += " \
	ssh-server-openssh \
	${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'weston','', d)} \
"

CORE_IMAGE_EXTRA_INSTALL += " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'weston-init', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11 wayland', 'weston-xwayland xterm', '', d)} \
"

APPLICATIONS = "\
	udev-extraconf \
"

BENCHMARKS = "\
	lmbench \
"

LIBRARIES = "\
	lvgl \
"

MULTIMEDIA = "\
	firmwared \
	imx-g2d-samples \
	linux-firmware-camera \
	media-ctl \
    packagegroup-fsl-gstreamer1.0 \
    packagegroup-fsl-gstreamer1.0-full \
    packagegroup-imx-isp \
    v4l-utils \
"

NETWORK_KIT = " \
	ethtool \
	nginx \
	phytool \
"

STRESS_TOOLS = " \
	cpuburn-arm \
	memtester \
"

TPM_FEATURES = " \
	tpm2-tools \
	libtss2 \
	libtss2-tcti-device \
	libtss2-tcti-mssim \
	tpm2-abrmd \
	tpm2-pkcs11 \
	tpm2-totp \
	tpm2-tss \
	tpm2-tss-engine \
	tpm2-tss-engine-dev \
"

MAS-TOOLS = " \
	binutils \
	can-utils \
	dpkg \
	evtest \
	hdparm \
	spidev-test \
"

IMAGE_INSTALL += " \
	${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'weston-init-mas-config', '', d)} \
	${BENCHMARKS} \
	${LIBRARIES} \
	${MAS-TOOLS} \
	${MULTIMEDIA} \
	${NETWORK_KIT} \
	${STRESS_TOOLS} \
"

export IMAGE_BASENAME = "mas-imx93-core-image"
