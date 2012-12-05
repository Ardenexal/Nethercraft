package ardenexal.nethercraft.blocks.machines;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IInventory;
import net.minecraft.src.ItemStack;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.NBTTagList;
import net.minecraft.src.TileEntity;

public class TileEntityMoldBench extends TileEntity implements IInventory{
	private ItemStack[] inv;
	
	public TileEntityMoldBench(){
		inv = new ItemStack[3];
	}
	@Override
	public int getSizeInventory() {
		// TODO Auto-generated method stub
		return inv.length;
	}

	@Override
	public ItemStack getStackInSlot(int var1) {
		// TODO Auto-generated method stub
		return inv[var1];
	}

	@Override
	public ItemStack decrStackSize(int var1, int var2) {
        ItemStack stack = getStackInSlot(var1);
        if (stack != null) {
                if (stack.stackSize <= var2) {
                        setInventorySlotContents(var1, null);
                } else {
                        stack = stack.splitStack(var2);
                        if (stack.stackSize == 0) {
                                setInventorySlotContents(var1, null);
                        }
                }
        }
        return stack;   
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int var1) {
        ItemStack stack = getStackInSlot(var1);
        if (stack != null) {
                setInventorySlotContents(var1, null);
        }
        return stack;
	}

	@Override
	public void setInventorySlotContents(int var1, ItemStack var2) {
        inv[var1] = var2;
        if (var2 != null && var2.stackSize > getInventoryStackLimit()) {
                var2.stackSize = getInventoryStackLimit();
        } 
		
	}

	@Override
	public String getInvName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getInventoryStackLimit() {
		// TODO Auto-generated method stub
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		 return worldObj.getBlockTileEntity(xCoord, yCoord, zCoord) == this &&
	                player.getDistanceSq(xCoord + 0.5, yCoord + 0.5, zCoord + 0.5) < 64;
	}

	@Override
	public void openChest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeChest() {
		// TODO Auto-generated method stub
		
	}
    @Override
    public void readFromNBT(NBTTagCompound tagCompound) {
            super.readFromNBT(tagCompound);
           
            NBTTagList tagList = tagCompound.getTagList("Inventory");
            for (int i = 0; i < tagList.tagCount(); i++) {
                    NBTTagCompound tag = (NBTTagCompound) tagList.tagAt(i);
                    byte slot = tag.getByte("Slot");
                    if (slot >= 0 && slot < inv.length) {
                            inv[slot] = ItemStack.loadItemStackFromNBT(tag);
                    }
            }
    }

    @Override
    public void writeToNBT(NBTTagCompound tagCompound) {
            super.writeToNBT(tagCompound);
                           
            NBTTagList itemList = new NBTTagList();
            for (int i = 0; i < inv.length; i++) {
                    ItemStack stack = inv[i];
                    if (stack != null) {
                            NBTTagCompound tag = new NBTTagCompound();
                            tag.setByte("Slot", (byte) i);
                            stack.writeToNBT(tag);
                            itemList.appendTag(tag);
                    }
            }
            tagCompound.setTag("Inventory", itemList);
    }

}
