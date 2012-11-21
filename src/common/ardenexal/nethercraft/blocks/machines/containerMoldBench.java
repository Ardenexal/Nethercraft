package ardenexal.nethercraft.blocks.machines;

import net.minecraft.src.Container;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.InventoryPlayer;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Slot;



public class containerMoldBench extends Container {

        protected MoldBenchTileEntity tileEntity;
       
        public containerMoldBench (InventoryPlayer inventoryPlayer, MoldBenchTileEntity te){
                tileEntity = te;

                //the Slot constructor takes the IInventory and the slot number in that it binds to
                //and the x-y coordinates it resides on-screen
                addSlotToContainer(new Slot(tileEntity, 0, 76, 37));

                //commonly used vanilla code that adds the player's inventory
                bindPlayerInventory(inventoryPlayer);
        }

        @Override
        public boolean canInteractWith(EntityPlayer player) {
                return tileEntity.isUseableByPlayer(player);
        }


        protected void bindPlayerInventory(InventoryPlayer inventoryPlayer) {
                for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 9; j++) {
                                addSlotToContainer(new Slot(inventoryPlayer, j + i * 9 + 9,
                                                8 + j * 18, 84 + i * 18));
                        }
                }

                for (int i = 0; i < 9; i++) {
                        addSlotToContainer(new Slot(inventoryPlayer, i, 8 + i * 18, 142));
                }
        }
        /**
         * @param itemStack ItemStack to merge into inventory
         * @param start minimum slot to attempt fill
         * @param end maximum slot to attempt fill
         * @param backwards go backwards
         * @return true if stacks merged successfully
         */
        
        @Override
        public ItemStack transferStackInSlot(EntityPlayer pl, int slot) {
                ItemStack stack = null;
                Slot slotObject = (Slot) inventorySlots.get(slot);

                //null checks and checks if the item can be stacked (maxStackSize > 1)
                if (slotObject != null && slotObject.getHasStack()) {
                        ItemStack stackInSlot = slotObject.getStack();
                        stack = stackInSlot.copy();

                        //merges the item into player inventory since its in the tileEntity
                        if (slot == 0) {
                                if (!mergeItemStack(stackInSlot, 1,
                                                inventorySlots.size(), true)) {
                                        return null;
                                }
                        //places it into the tileEntity is possible since its in the player inventory
                        } else if (!mergeItemStack(stackInSlot, 0, 1, false)) {
                                return null;
                        }

                        if (stackInSlot.stackSize == 0) {
                                slotObject.putStack(null);
                        } else {
                                slotObject.onSlotChanged();
                        }
                }

                return stack;
        }
}
