/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package filepacket;

import java.io.Serializable;


public class Packet implements Serializable
{
    public String job_id;
    public int packet_type;
    public String priority;
    public String username;
    public String password;
    public String to_email_ids;
    public String subject;
    public String content;
    public String filename;
    public String duration;

    public Packet(int pack_type,String username,String password,String to_email_ids,String subject,String content,String filename,String duration)
    {
        this.packet_type=pack_type;
        this.username=username;
        this.password=password;
        this.to_email_ids=to_email_ids;
        this.subject=subject;
        this.content=content;
        this.filename=filename;
        this.duration=duration;

    }



}
