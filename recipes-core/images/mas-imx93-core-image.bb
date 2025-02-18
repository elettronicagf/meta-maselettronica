# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "This is the main core image for MAS NEITH000X systems"

require recipes-core/images/mas-imx93-core-image-minimal.bb

IMAGE_FEATURES += " \
	ssh-server-openssh \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'weston', \
       bb.utils.contains('DISTRO_FEATURES',     'x11', 'x11-base x11-sato', \
                                                       '', d), d)} \
"

APPLICATIONS = "\
"

LIBRARIES = "\
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
"

IMAGE_INSTALL += " \
	${@bb.utils.contains('DISTRO_FEATURES', 'x11 wayland', 'weston-xwayland xterm', '', d)} \
	${MAS-TOOLS} \
	${NETWORK_KIT} \
	${STRESS_TOOLS} \
"

export IMAGE_BASENAME = "mas-imx93-core-image"
