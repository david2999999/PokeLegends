import { BattleItemBag } from './battle-item-bag.model';
import { BerryBag } from './berry-bag.model';
import { ItemBag } from './item-bag.model';
import { KeyItemBag } from './key-item-bag.model';
import { MailBag } from './mail-bag.model';
import { MedicineBag } from './medicine-bag.model';
import { PokeBallBag } from './pokeball-bag.model';
import { TMBag } from './tm-bag.model';

export interface Bag {
    bagId           : number;
    battleItemBag   : BattleItemBag;
    berryBag        : BerryBag;
    itemBag         : ItemBag;
    keyItemBag      : KeyItemBag;
    mailBag         : MailBag;
    medicineBag     : MedicineBag;
    pokeballBag     : PokeBallBag;
    tmBag           : TMBag;
}