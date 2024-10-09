package com.entity;

public class Student
{
        private String usn;
        private String name;
        private String city;

        public String getCity()
        {
            return city;
        }

        public void setCity(String city)
        {
            this.city = city;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getUsn()
        {
            return usn;
        }

        public void setUsn(String usn)
        {
            this.usn = usn;
        }

        @Override
        public String toString() {
            return "Student [" +
                    "Usn='" + usn + '\'' +
                    ", Name='" + name + '\'' +
                    ", City='" + city + '\'' +
                    ']';
        }
    }
