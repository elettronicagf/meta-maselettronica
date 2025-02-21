#!/bin/sh

STDOUT="/dev/ttyLP0"

#echo -e "         Finished \033[1mCUSTOM app\033[0m: launched properly." > $STDOUT

# update system clock to hwclock
hwclock --hctosys -f /dev/rtc0
echo -e "         Finished \033[1mCUSTOM Application\033[0m: set the System Time from the hwclock." > $STDOUT

#echo ">> " > $STDOUT

#MOUNT_FAT32_FLD="/mnt/produzione"
#MOUNT_FAT32_DEV="/dev/mmcblk1p2"

#mkdir -p $MOUNT_FAT32_FLD
#mount $MOUNT_FAT32_DEV $MOUNT_FAT32_FLD
#sync

#BASE_FLD="$MOUNT_FAT32_FLD/Prog-eMMC"
#BSP_FLD="$BASE_FLD/BSP"

#mkdir -p $BASE_FLD
#mkdir -p $BSP_FLD

sync

# enable gpio watchdog
#/root/test-mas/wdtgpioset on > $STDOUT
#echo -e "         Finished \033[1mCUSTOM Application\033[0m: enabled gpio Watchdog." > $STDOUT

# generate ssh-keys if necessary
if [[ ! -z `mount | grep "on / type ext4 (ro,"` ]]; then

	echo -e "         Reached \033[1mCUSTOM Application\033[0m: FS in read-only mode." > $STDOUT
	
	cd /etc/ssh
	count=`ls -1 *.pub 2>/dev/null | wc -l`
	
	if [ $count == 0 ]; then 
		/root/test-mas/create_sshkeys > $STDOUT
		echo -e "         Finished \033[1mCUSTOM Application\033[0m: SSH Keys generated." > $STDOUT
	fi 
	
fi



