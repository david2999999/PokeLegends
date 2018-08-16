import { BattleItem } from '../item/battle-item.model';  

export interface BattleItemBag {
    battleItemBagId     : number;
    battleItems         : BattleItem[];
}