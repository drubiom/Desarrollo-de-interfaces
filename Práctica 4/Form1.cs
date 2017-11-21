using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Practica_4
{
    public partial class Form1 : Form
    {
        int nuMax, nuSel;

    public Form1()
        {
            InitializeComponent();
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (comboBox1.SelectedIndex != -1)
            {
                if (radioButton2.Checked)
                {
                    switch (comboBox1.SelectedIndex)
                    {
                        case 0://SIMPLE
                            for (int i = 0; i < 16; i++)
                                numeros[i].Checked = false;
                            nuSel = 0;
                            nuMax = 4;
                            automatico();
                            reintegro();
                            break;
                        case 1://MULTIPLE
                            for (int i = 0; i < 16; i++)
                                numeros[i].Checked = false;
                            nuMax = 6;
                            nuSel = 0;
                            automatico();
                            reintegro();
                            break;
                        case 2://EXTREMA
                            for (int i = 0; i < 16; i++)
                                numeros[i].Checked = false;
                            nuMax = 8;
                            nuSel = 0;
                            automatico();
                            reintegro();
                            break;
                    }
                }
                else
                    switch (comboBox1.SelectedIndex)
                    {
                        case 0://SIMPLE
                            activa();
                            reintegro();
                            nuMax = 4;
                            break;
                        case 1://MULTIPLE
                            activa();
                            reintegro();
                            nuMax = 6;
                            break;
                        case 2://EXTREMA
                            activa();
                            reintegro();
                            nuMax = 8;
                            break;
                    }
            }
        }

        private void radioButton2_CheckedChanged(object sender, EventArgs e)
        {
            if (radioButton2.Checked)
                automatico();
        }

        public void activa()
        {
            nuSel = 0;
            radioButton1.Enabled = true;
            radioButton2.Enabled = true;
            radioButton1.Checked = true;
            radioButton2.Checked = false;
            button1.Enabled = true;
            dateTimePicker1.Enabled = true;
            for (int i = 0; i < 16; i++)
                numeros[i].Enabled = true;
            for (int i = 0; i < 16; i++)
                numeros[i].Checked = false;
        }

        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {
            if (radioButton1.Checked && comboBox1.SelectedIndex != -1)
                activa();
        }
        private void checkBox1_CheckedChanged(object sender, EventArgs e)
        {
            comprueba(0);
        }
        private void checkBox2_CheckedChanged(object sender, EventArgs e)
        {
            comprueba(1);
        }
        private void checkBox3_CheckedChanged(object sender, EventArgs e)
        {
            comprueba(2);
        }
        private void checkBox4_CheckedChanged(object sender, EventArgs e)
        {
            comprueba(3);
        }
        private void checkBox5_CheckedChanged(object sender, EventArgs e)
        {
            comprueba(4);
        }
        private void checkBox6_CheckedChanged(object sender, EventArgs e)
        {
            comprueba(5);
        }

        private void checkBox7_CheckedChanged(object sender, EventArgs e)
        {
            comprueba(6);
        }
        private void checkBox8_CheckedChanged(object sender, EventArgs e)
        {
            comprueba(7);
        }
        private void checkBox9_CheckedChanged(object sender, EventArgs e)
        {
            comprueba(8);
        }
        private void checkBox10_CheckedChanged(object sender, EventArgs e)
        {
            comprueba(9);
        }
        private void checkBox11_CheckedChanged(object sender, EventArgs e)
        {
            comprueba(10);
        }
        private void checkBox12_CheckedChanged(object sender, EventArgs e)
        {
            comprueba(11);
        }
        private void checkBox13_CheckedChanged(object sender, EventArgs e)
        {
            comprueba(12);
        }
        private void checkBox14_CheckedChanged(object sender, EventArgs e)
        {
            comprueba(13);
        }
        private void checkBox15_CheckedChanged(object sender, EventArgs e)
        {
            comprueba(14);
        }
        private void checkBox16_CheckedChanged(object sender, EventArgs e)
        {
            comprueba(15);
        }
        private void comprueba(int check)
        {
            if (nuSel == nuMax)
                if (numeros[check].Checked)
                    numeros[check].Checked = false;
                else
                    nuSel--;
            else
                  if (numeros[check].Checked)
                nuSel++;
            else
                nuSel--;
        }

        private void dateTimePicker1_ValueChanged(object sender, EventArgs e)
        {
            if(dateTimePicker1.Value < DateTime.Today)
            {
                MessageBox.Show("No se puede participar en un sorteo anterior","Error");
                dateTimePicker1.Value = DateTime.Today;
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (nuSel != nuMax)
                MessageBox.Show("Quedan números por seleccionar","Error");
            else
            {
                groupBox1.Enabled = false;
                groupBox2.Enabled = true;
                imprime();
            }
        }

        private void reintegro()
        {
            Random rndm = new Random();
            textBox1.Text = rndm.Next(1, 11).ToString();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            comboBox1.SelectedIndex = -1;
            groupBox1.Enabled = true;
            groupBox2.Enabled = false;
            nuSel = 0;
            for (int i = 0; i < 16; i++)
                numeros[i].Enabled = false;
            for (int i = 0; i < 16; i++)
                numeros[i].Checked = false;
            textBox2.Text = "";
            textBox1.Text = "";
            radioButton1.Enabled = false;
            radioButton2.Enabled = false;
            radioButton1.Checked = true;
            radioButton2.Checked = false;
            button1.Enabled = false;
            dateTimePicker1.Enabled = false;
            dateTimePicker1.Value = DateTime.Today;
        }

        private void automatico()
        {
            nuSel = 0;
            for (int i = 0; i < 16; i++)
                numeros[i].Enabled = false;
            while (nuSel < nuMax)
            {
                Random rndm = new Random();
                int aux = rndm.Next(0, 16);
                if (numeros[aux].Checked == false)
                {
                    numeros[aux].Checked = true;
                    nuSel++;
                }

            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            string message = "¿Realmente quieres salir?";
            string caption = "Salir";
            MessageBoxButtons buttons = MessageBoxButtons.YesNo;
            DialogResult result;
            result = MessageBox.Show(message, caption, buttons);
            if (result == System.Windows.Forms.DialogResult.Yes)
                this.Close();
        }

        private void imprime()
        {
            string apuesta;
            int aux = 1;
            for(int i = 0; i < numeros.Length; i++)
            {
                if (numeros[i].Checked)
                {
                    apuesta = "Número " + aux + ": " + numeros[i].Text + "\r\n";
                    textBox2.Text += apuesta;
                    aux++;
                }
            }
            textBox2.Text += "Reintegro: " + textBox1.Text;
        }
    }
}
