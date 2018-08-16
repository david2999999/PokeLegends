import { Merchandise } from './merchandise.model';
import { Type } from '../pokemon/type.enum';

export interface TM extends Merchandise {
    tmId     : number;
    type     : Type;
    pp       : number;
    power    : number;
    accuracy : number;
}