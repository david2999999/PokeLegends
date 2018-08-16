import { Mail } from '../item/mail.model';

export interface MailBag {
    mailBagId   : number;
    mails       : Mail[];
}