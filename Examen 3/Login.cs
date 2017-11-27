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
    public partial class Login : Form
    {
        public Login()
        {
            InitializeComponent();
        }
        string usuario;
        string pass;
        private void button1_Click(object sender, EventArgs e)
        {
            //Limpiar registro
            limpiaRegistro();
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {
            //Selecciona imagen
            openFileDialog1.ShowDialog();
            pictureBox1.ImageLocation = openFileDialog1.FileName;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            if (!usuarioCorrecto())
                MessageBox.Show("Debe ser gmail.com y no contener arrobas", "Error de usuario", MessageBoxButtons.OK,MessageBoxIcon.Error);
            else if (!passCorrecto())
                MessageBox.Show("La contraseña debe ser al menos 4 caracteres y contener un símbolo", "Error de contraseña", MessageBoxButtons.OK, MessageBoxIcon.Error);
            else if (!fechaCorrecta())
                MessageBox.Show("Debes tener al menos 18 años", "Error de fecha", MessageBoxButtons.OK, MessageBoxIcon.Error);
            else if (pictureBox1.Image == null)
                MessageBox.Show("Falta la imagen, o ha ocurrido un error", "Error de imagen", MessageBoxButtons.OK, MessageBoxIcon.Error);
            //si todo correcto, guarda email/contraseña, limpia, activa login, desactiva registro
            else
            {
                usuario = textBox1.Text;
                pass = textBox2.Text;
                limpiaRegistro();
                groupBox1.Enabled = false;
                groupBox2.Enabled = true;
                MessageBox.Show("Registro Correcto", "Registro", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
        }

        private bool fechaCorrecta()
        {
            bool correcta = true;
            int edad;
            //si ha pasado el dia o es hoy
            if(DateTime.Today.Month > dateTimePicker1.Value.Month)
                edad = DateTime.Today.Year - dateTimePicker1.Value.Year;
            if (DateTime.Today.Month == dateTimePicker1.Value.Month && DateTime.Today.Day >= dateTimePicker1.Value.Day)
                edad = DateTime.Today.Year - dateTimePicker1.Value.Year;
            //si no
            else
                edad = edad = DateTime.Today.Year - dateTimePicker1.Value.Year -1;
            // si edad es menor que 18
            if (edad < 18)
                correcta = false;
            return correcta;
        }
        private bool usuarioCorrecto()
        {
            if (textBox1.Text.Length > 10)
            {
                int contador = 0;
                char[] usuario = textBox1.Text.ToCharArray();
                char[] aux = new char[10];
                char[] gmail = { '@', 'g', 'm', 'a', 'i', 'l', '.', 'c', 'o', 'm' };
                for (int i = 0; i < usuario.Length; i++)
                {
                    if (usuario[i] == '@')
                        contador++;
                }
                for (int i = usuario.Length - 1, j = 9; i >= (usuario.Length - 10); i--, j--)
                    aux[j] = usuario[i];
                if (contador != 1)
                    return false;
                bool correcto = true;
                for (int i = 0; i < 10; i++)
                {
                    if (aux[i] != gmail[i])
                        correcto = false;
                }
                return correcto;
            }
            else
                return false;
        }
        private bool passCorrecto()
        {
            if (textBox2.Text.Length != 0)
            {
                int contador = 0;
                char[] pass = textBox2.Text.ToCharArray();
                for (int i = 0; i < pass.Length; i++)
                {
                    if (pass[i] == '+' || pass[i] == '-' || pass[i] == '*' || pass[i] == '/')
                        contador++;
                }
                if (pass.Length < 4)
                    return false;
                if (contador == 0)
                    return false;
                return true;
            }
            else
                return false;
        }
        private void limpiaRegistro()
        {
            textBox1.Text = "";
            textBox2.Text = "";
            dateTimePicker1.Value = DateTime.Today;
            pictureBox1.Image = null;
        }

        private void checkBox1_CheckedChanged(object sender, EventArgs e)
        {
            //si se activa, muestra contraseña abajo
            if (checkBox1.Checked)
                textBox5.Text = textBox3.Text;
            // si no, textbox ""
            else
                textBox5.Text = "";
        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {
            if (checkBox1.Checked)
                textBox5.Text = textBox3.Text;
        }

        private void button4_Click(object sender, EventArgs e)
        {
            textBox4.Text = "";
            textBox5.Text = "";
            textBox3.Text = "";
            checkBox1.Checked = false;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            if (textBox4.Text != usuario || textBox3.Text != pass)
                MessageBox.Show("Error en el acceso", "Login", MessageBoxButtons.OK, MessageBoxIcon.Error);
            else
            {
                MessageBox.Show("Acceso correcto", "Login", MessageBoxButtons.OK, MessageBoxIcon.Information);
                this.Visible = false;
                Form1 form = new Form1();
                form.Show();
            }
        }
    }
}
