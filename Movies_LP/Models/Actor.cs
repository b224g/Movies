﻿using System;
using System.Collections.Generic;

namespace Movies_LP.Models
{
    public partial class Actor
    {
        public int Id { get; set; }
        public string Name { get; set; } = null!;
        public string Surname { get; set; } = null!;
        public DateTime Birthday { get; set; }
    }
}
