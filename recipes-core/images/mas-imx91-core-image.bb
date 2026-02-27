# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "This is the main core image for MAS NEITH000X systems"

require recipes-core/images/mas-imx93-core-image-minimal.bb


IMAGE_FEATURES += " \
	ssh-server-openssh \
"

#CORE_IMAGE_EXTRA_INSTALL += " \
#    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'weston-init', '', d)} \
#    ${@bb.utils.contains('DISTRO_FEATURES', 'x11 wayland', 'weston-xwayland xterm', '', d)} \
#"

APPLICATIONS = "\
	udev \
	udev-extraconf \
"

BENCHMARKS = "\
	fio \
	lmbench \
"

LIBRARIES = "\
	python3 \
	python3-pygobject \
	python3-pyserial \
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
	iperf3 \
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
	imx-test \
	procps \
	spidev-test \
"

IMAGE_INSTALL += " \
	${APPLICATIONS} \
	${BENCHMARKS} \
	${LIBRARIES} \
	${MAS-TOOLS} \
	${NETWORK_KIT} \
	${STRESS_TOOLS} \
"

export IMAGE_BASENAME = "mas-imx91-core-image"
