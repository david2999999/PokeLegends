import { Gender } from './gender.enum';
import { Nature } from './nature.enum';
import { Exp } from './exp.model';
import { Stat } from './stat.model';
import { Multiplier } from './multiplier.model';
import { Type } from './type.enum';

export interface Pokemon {
    pokemonId   : number;
    name        : string;
    nickName    : string;
    gender      : Gender;
    nature      : Nature;
    exp         : Exp;
    type        : Type[];
    currentStat : Stat;
    baseStat    : Stat;
    maxStat     : Stat;
    multiplier  : Multiplier;
}