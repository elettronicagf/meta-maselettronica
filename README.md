# OpenEmbedded/Yocto Project BSP Layer for Mas Elettronica Platforms

Welcome to `meta-maselettronica`. This document outlines our commitment to providing consistent support and updates in alignment with the Yocto Project LTS release schedule.

This layer provides support for MAS Elettronica platforms for use with NXP layers, OpenEmbedded and/or Yocto Project.


# Download the BSP Repo [for LOCAL builds]

repo init -u /home/repo-shared/manifests/yocto-manifests.git -b iMX9-OSM-6.6.y-scarthgap -m imx9-osm-6.6.y-local.xml 
repo sync 


# Download the BSP Repo [for REMOTE builds] 

repo init -u git@gitrepo.egf.it:egf/egf-pd/repo-shared/manifests/yocto-manifests.git -b iMX9-OSM-6.6.y-scarthgap -m imx9-osm-6.6.y-remote.xml 
repo sync

