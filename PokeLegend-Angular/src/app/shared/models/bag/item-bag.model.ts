import { Item } from '../item/item.model';

export interface ItemBag {
    itemBagId   : number;
    items       : Item[];
}